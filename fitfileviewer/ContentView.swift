//
//  ContentView.swift
//  fitfileviewer
//
//  Created by Roberto Viola on 14/03/24.
//

import SwiftUI

import ObjcFIT

final class fitfile: NSObject, ObservableObject, FITMesgDelegate, FITFileIdMesgDelegate, FITActivityMesgDelegate, FITSessionMesgDelegate, FITLapMesgDelegate, FITRecordMesgDelegate, FITDeveloperFieldDefinitionDelegate {
    
    @Published var messages: [String] = []
    var fileName = ""

    /**
     Test decoding a FIT file using the FITMessageBroadcaster and delegate methods.
     - Note: This mimics the decoding paradigm used by other FIT SDKs.
     - Note: Implement the delegate method for each message of interested, and connect it to the  Broadcaster.
     */
    // This is the generic onMesg delegate that gets called for every message
    func onMesg(_ message: FITMessage) {
        print(message)
        if(message.getNum() == FITMesgNumFileId) {
            let fileIdMesg = FITFileIdMesg(message: message)
        }

        return
    }

    func onFileIdMesg(_ message: FITFileIdMesg) {
        return
    }

    func onActivityMesg(_ message: FITActivityMesg) {
        DispatchQueue.main.async {
                    // Assuming you transform FITMessage to a String describing the relevant attributes
            self.messages.append("Message: \(message.getTimestamp().date)")
                }
        print(message)
    }

    func onSessionMesg(_ message: FITSessionMesg) {
        print(message)
    }

    func onLapMesg(_ message: FITLapMesg) {
        print(message)
    }

    func onRecordMesg(_ message: FITRecordMesg) {
        print(message)
    }

    func onDeveloperFieldDefinition(_ developerFieldDef: FITDeveloperFieldDefinition) {
    }
    
    func updateFileName(newFileName: String) {
           self.fileName = newFileName
       // Assuming you'll use fileName in the setup process, add that logic here.
       setupDecoder()
    }

   private func setupDecoder() {
       let decoder = FITDecoder()
       let broadcaster = FITMessageBroadcaster()
       decoder.mesgDelegate = broadcaster
       decoder.developerFieldDefinitionDelegate = self
       broadcaster.mesgDelegate = self
       broadcaster.fitFileIdMesgDelegate = self
       broadcaster.fitActivityMesgDelegate = self
       broadcaster.fitSessionMesgDelegate = self
       broadcaster.fitLapMesgDelegate = self
       broadcaster.fitRecordMesgDelegate = self
       
       print(decoder.isFIT(fileName))
       decoder.decodeFile(fileName)
   }
}


struct ContentView: View {
    @State var fileName: String
    @StateObject var fitFile = fitfile()
    var body: some View {
        VStack {
            Button("Load New File") {
                fitFile.updateFileName(newFileName: "example.fit")
            }.onAppear() {
                fitFile.updateFileName(newFileName: Bundle.main.path(forResource: "example", ofType: "fit") ?? "")
            }
            List(fitFile.messages, id: \.self) { message in
                    Text(message)
                }
        }
        .padding()
    }
}

#Preview {
    ContentView(fileName: "example.fit")
}

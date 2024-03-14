//
//  ContentView.swift
//  fitfileviewer
//
//  Created by Roberto Viola on 14/03/24.
//

import SwiftUI

struct ContentView: View {
    @State var fileName: String
    var body: some View {
        VStack {
            Image(systemName: "globe")
                .imageScale(.large)
                .foregroundStyle(.tint)
            Text("Hello, world!")
        }
        .padding()
    }
}

#Preview {
    ContentView(fileName: "example.fit")
}

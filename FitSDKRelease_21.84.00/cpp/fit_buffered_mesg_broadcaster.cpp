///////////////////////////////////////////////////////////////////////////////////
// The following FIT Protocol software provided may be used with FIT protocol
// devices only and remains the copyrighted property of Garmin International, Inc.
// The software is being provided on an "as-is" basis and as an accommodation,
// and therefore all warranties, representations, or guarantees of any kind
// (whether express, implied or statutory) including, without limitation,
// warranties of merchantability, non-infringement, or fitness for a particular
// purpose, are specifically disclaimed.
//
// Copyright 2022 Garmin International, Inc.
///////////////////////////////////////////////////////////////////////////////////
// ****WARNING****  This file is auto-generated!  Do NOT edit this file.
// Profile Version = 21.84Release
// Tag = production/akw/21.84.00-0-g894a113c
///////////////////////////////////////////////////////////////////////////////////



#include "fit_buffered_mesg_broadcaster.hpp"


namespace fit
{

void BufferedMesgBroadcaster::RegisterMesgBroadcastPlugin(MesgBroadcastPlugin* plugin)
{
   plugins.push_back(plugin);
}

void BufferedMesgBroadcaster::OnMesg(Mesg& mesg)
{
   mesgs.push_back(mesg);

   // Pass the message to each plugin. This gives the
   // plugin a chance to peek the incoming messages
   for(size_t i = 0; i < plugins.size(); i++)
   {
      if(plugins[i])
         plugins[i]->OnIncomingMesg(mesg);
   }
}

void BufferedMesgBroadcaster::Broadcast(void)
{
   for(size_t i = 0; i < plugins.size(); i++)
   {
      if(plugins[i])
         plugins[i]->OnBroadcast(mesgs);
   }

   for(size_t j = 0; j < mesgs.size(); j++)
   {
      MesgBroadcaster::OnMesg(mesgs[j]);
   }
}

} // namespace fit

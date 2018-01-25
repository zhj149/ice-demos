// **********************************************************************
//
// Copyright (c) 2003-2018 ZeroC, Inc. All rights reserved.
//
// **********************************************************************

public class Client
{
    public static void main(String[] args)
    {
        int status = 0;
        java.util.List<String> extraArgs = new java.util.ArrayList<>();

        final String appName = "demo.Database.library.Client";

        //
        // try with resource block - communicator is automatically destroyed
        // at the end of this try block
        //
        try(com.zeroc.Ice.Communicator communicator = com.zeroc.Ice.Util.initialize(args, "config.client", extraArgs))
        {
            if(extraArgs.size() > 1)
            {
                System.err.println("Usage: " + appName + " [file]");
                status = 1;
            }
            else
            {
                status = RunParser.runParser(appName, args, communicator);
            }
        }

        System.exit(status);
    }
}

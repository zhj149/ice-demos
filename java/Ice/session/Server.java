// **********************************************************************
//
// Copyright (c) 2003-2018 ZeroC, Inc. All rights reserved.
//
// **********************************************************************

public class Server extends com.zeroc.Ice.Application
{
    @Override
    public int run(String[] args)
    {
        if(args.length > 0)
        {
            System.err.println(appName() + ": too many arguments");
            return 1;
        }

        com.zeroc.Ice.ObjectAdapter adapter = communicator().createObjectAdapter("SessionFactory");

        adapter.add(new SessionFactoryI(), com.zeroc.Ice.Util.stringToIdentity("SessionFactory"));
        adapter.activate();
        communicator().waitForShutdown();

        return 0;
    }

    public static void main(String[] args)
    {
        Server app = new Server();
        int status = app.main("Server", args, "config.server");
        System.exit(status);
    }
}

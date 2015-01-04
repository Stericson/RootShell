package com.stericson.RootShell.execution;

import android.content.Context;

public class JavaCommand extends Command
{
    public JavaCommand(int id, Context context, String... command)
    {
        super(id, true, context, command);
    }

    public JavaCommand(int id, boolean handlerEnabled, Context context, String... command)
    {
        super(id, handlerEnabled, true, context, command);
    }

    public JavaCommand(int id, int timeout, Context context, String... command)
    {
        super(id, timeout, true, context, command);
    }

    @Override
    public void commandOutput(int id, String line)
    {
        super.commandOutput(id, line);
    }

    @Override
    public void commandTerminated(int id, String reason)
    {
        // pass
    }

    @Override
    public void commandCompleted(int id, int exitCode)
    {
        // pass
    }
}

package ch.mhf.socket;

import java.io.IOException;
import java.net.ServerSocket;

public class Socket
{
    // Variante A: Nutzung mit finally
    public static boolean openAndProcessA()
    {
        ServerSocket serverSocket = null;
        try
        {
            final int AUTO_ALLOCATE_PORT = 0;
            serverSocket = new ServerSocket(AUTO_ALLOCATE_PORT);

            // handleIncomingConnections(serverSocket);
            return true;
        }
        catch (final IOException e)
        {
            return false;
        }
        finally
        {
            closeServerSocket(serverSocket);
        }
    }

    // Variante B: Nutzung von ARM Automatic Resource Management
    public static boolean openAndProcessB()
    {
        final int AUTO_ALLOCATE_PORT = 0;
        try (final ServerSocket serverSocket = new ServerSocket(AUTO_ALLOCATE_PORT))
        {
            // handleIncomingConnections(serverSocket);
            return true;
        }
        catch (final IOException ex)
        {
            return false;
        }
    }

    private static void closeServerSocket(final ServerSocket serverSocket)
    {
        if (serverSocket != null)
        {
            try
            {
                serverSocket.close();
            }
            catch (final IOException e)
            {

            }
        }
    }
}

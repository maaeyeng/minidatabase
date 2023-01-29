class connect {
    private String[] servername;
    private String[] ipv4;
    private int port;
    private String[] username;
    private String[] password;

    public String[] get_servername() {
        return this.servername;

    }
    public void set_servername(String[] _servername){
       this.servername = _servername;
    }

    public NetServer(int portnum){
        this.port = portnum;
        start();
    }

    public void run () {
        ServerSocket server_socket = null;
        try {
            server_socket = new ServerSocket( portnum );
            while ( true ) {
                createClientPort ( server_socket.accept () );
        }
        catch ( IOException ioerror ) {
            System.err.println ( "IO Error opening server socket" );
        }
        finally {
            if ( server_socket != null ) {
                try {
                    server_socket.close();
                }
                catch ( IOException ioe ) {
                }
            }
        }
    }
    }
}
package server;

import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;

public class Server {

    static int counter=0;

    public static void main(String[] args) {
         int portNum = 4446;

        //int portNum = Integer.parseInt(System.getProperty("ServerPort"));

        HttpServer server = null;

        try{
            server = HttpServer.create();
            server.bind(new InetSocketAddress(portNum), 0);
                    }
         catch (IOException e) {
            e.printStackTrace();
        }

        HttpContext context = server.createContext("/", new Server.EchoHandler());

        HttpContext context2 = server.createContext("/help", new Server.EchoHandler2());

        HttpContext context3 = server.createContext("/time", new Server.EchoHandler3());


        server.setExecutor(null);
        server.start();
    }


    static class EchoHandler implements HttpHandler {

        @Override
        public void handle(HttpExchange exchange) throws IOException {

            StringBuilder builder = new StringBuilder();

            ArrayList<String> headers = new ArrayList<>();
            exchange.getRequestHeaders().values().forEach(s-> headers.add(s.toString()));
            exchange.getRequestHeaders().values().forEach(o-> System.out.println("header=" + o));

            for (String a : headers) {
                if (a.contains("Hello")) {
                    builder.append("Hello to, my friend");
                }

            }

            builder.append("GoGoGo!!!!!!!!!");
            byte[] bytes = builder.toString().getBytes();
            exchange.sendResponseHeaders(200, bytes.length);

            OutputStream os = exchange.getResponseBody();
            os.write(bytes);
            os.close();
            exchange.close();
        }
    }

    static class EchoHandler2 implements HttpHandler {

        @Override
        public void handle(HttpExchange exchange) throws IOException {

            StringBuilder builder = new StringBuilder();

            ArrayList<String> headers = new ArrayList<>();
            exchange.getRequestHeaders().values().forEach(s-> headers.add(s.toString()));
            exchange.getRequestHeaders().values().forEach(o-> System.out.println("header=" + o));

            for (String a : headers) {
                if (a.contains("Hello")) {
                    builder.append("Hello to, my friend");
                }

            }

            builder.append("Hello!:)");


            byte[] bytes = builder.toString().getBytes();
            exchange.sendResponseHeaders(200, bytes.length);

            OutputStream os = exchange.getResponseBody();
            os.write(bytes);
            os.close();
            exchange.close();
        }
    }


    static class EchoHandler3 implements HttpHandler {

        @Override
        public void handle(HttpExchange exchange) throws IOException {

            StringBuilder builder = new StringBuilder();

            ArrayList<String> headers = new ArrayList<>();
            exchange.getRequestHeaders().values().forEach(s-> headers.add(s.toString()));
            exchange.getRequestHeaders().values().forEach(o-> System.out.println("header=" + o));

            Date date = new Date();
            builder.append("Date and time:");
            builder.append('\n');
            builder.append(date.toString());

            byte[] bytes = builder.toString().getBytes("windows-1251");
            exchange.sendResponseHeaders(200, bytes.length);

            OutputStream os = exchange.getResponseBody();
            os.write(bytes);
            os.close();
            exchange.close();
        }
    }



}

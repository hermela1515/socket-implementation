# socket-implementation
# 🖧 Java Socket Programming  

Welcome to the Java Socket Programming project! 🚀 This repository is all about building a simple yet effective chat system where a server and client can talk to each other using Java sockets. It's a great way to learn how networking works!  

## 🌟 Features  
- Chat in real time: The client and server can send messages back and forth.  
- Clear connection management: Handles client-server communication smoothly.  
- Interactive user input: Type your messages live on the client side.  
- Safe disconnection: End the session gracefully with exit.  

## 📁 Project Files  
- `server.java`: The server-side application that listens for connections and processes messages.  
- `client.java`: The client-side application that connects to the server and communicates.  

## 🛠 How It Works  

### 🖥 Server  
- Listens on port 9090 for incoming connections.  
- Welcomes a client when they connect.  
- Processes client messages and sends responses.  

### 💻 Client  
- Connects to the server at a specified hostname and port (localhost:9090).  
- Sends messages and receives responses.  

---

## 🚀 How to Get Started  

1. Clone this Repository  
   bash  
   git clone https://github.com/your-username/java-socket-programming.git  
   cd java-socket-programming  
     

2. Compile the Code  
   Open a terminal and compile both the server.java and client.java:  
   bash  
   javac server.java client.java  
     

3. Run the Server  
   Open one terminal and start the server:  
   bash  
   java server  
     
   You’ll see this:  
     
   Server is listening on port 9090  
     

4. Run the Client  
   Open another terminal and start the client:  
   bash  
   java client  
     
   The client will show:  
     
   Connected to the server!  
   Enter messages to send to the server (type 'exit' to quit):  
     

5. Start the Conversation!  
   - Type your messages in the client terminal, and the server will respond.  
   - Continue chatting until you type exit to disconnect.  

---

## 🧩 Example Chat Session  

### Client Terminal:  
  
Connected to the server!  
Enter messages to send to the server (type 'exit' to quit):  
Hello, Server!  
Server: Received -> Hello, Server!  
exit  
Connection closed.  
  

### Server Terminal:  
  
Server is listening on port 9090  
Client connected!  
Client: Hello, Server!  
Client disconnected.  
Server shut down.  
  

---








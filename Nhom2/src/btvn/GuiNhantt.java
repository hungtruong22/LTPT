/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Admin
 */
public class GuiNhantt {
    ServerSocket Sserver;
    public void MoCong(int port) throws Exception{
        Sserver = new ServerSocket(port);
        System.out.println("Da mo cong: " + port);
    }
    
    public String Nhan() throws Exception{
        Socket c = Sserver.accept();//lặp vô hạn để đợi kết nối đến
        //Tạo luồng để nhận thông tin client gửi lên
        InputStreamReader is= new InputStreamReader(c.getInputStream());
        //Tạo bộ đệm để lưu dữ liệu nhận về
        BufferedReader r= new BufferedReader(is);
        return r.readLine();
    }
    
    public void Gui(String data, String Ipserver, int port) throws Exception{
        Socket c = new Socket(Ipserver, port);
        // Tạo luồng để ghi dữ liệu lên Server
        DataOutputStream out =new DataOutputStream(c.getOutputStream());
        out.writeBytes(data); //Gửi thông báo
        out.write(13);
        out.write(10);
        out.close();
    }
}

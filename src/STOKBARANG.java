import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.text.html.FormView.SUBMIT;

public class STOKBARANG {
    private JTextField Token;
    private JTextField HargaTertinggi;
    private JButton SUBMITButton;
    private JButton CLOSEButton;

    public STOKBARANG() {
        SUBMITButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SUBMITButton = new JButton("SUBMIT");


            }
        });
        CLOSEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame=new JFrame("Close Button");
                JButton closeButton= new JButton("Close");
                closeButton.addActionListener(e1 -> {
                    frame.dispose();
                    frame.getContentPane().add(closeButton);
                    frame.setSize(300, 200);
                    frame.setVisible(true);
                }
            }




    public JTextField getToken() {
        return Token;
    }

    public void setToken(JTextField token) {
        Token = token;
    }

    public JTextField getHargaTertinggi() {
        return HargaTertinggi;
    }

    public void setHargaTertinggi(JTextField hargaTertinggi) {
        HargaTertinggi = hargaTertinggi;
    }

    public JButton getSUBMITButton() {
        return SUBMITButton;
    }

    public void setSUBMITButton(JButton SUBMITButton) {
        this.SUBMITButton = SUBMITButton;
    }

    public JButton getCLOSEButton() {
        return CLOSEButton;
    }

    public void setCLOSEButton(JButton CLOSEButton) {
        this.CLOSEButton = CLOSEButton;
    }
}

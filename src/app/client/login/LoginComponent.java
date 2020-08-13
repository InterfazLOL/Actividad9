package app.client.login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

import app.client.vistaPrincipal.VistaPrincipalComponent;
import app.services.servicesGraphics.RecursosService;
import app.services.servicesLogic.UsuarioService;

public class LoginComponent implements ActionListener, MouseListener, FocusListener, MouseMotionListener {

    private LoginTemplate loginTemplate;
    private UsuarioService sUsuario;
    private int x, y;

    public LoginComponent() {

        sUsuario = UsuarioService.gService();
        loginTemplate = new LoginTemplate(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginTemplate.getbAyuda()) {
            //JOptionPane.showMessageDialog(null, "Las ayudas no existen mrko", "Advertencia", 1); // 0 error, 1
                                                                                                 // informativo, 2
                                                                                                 // advertencia, 3
                                                                                                 // pregunta
        } else if (e.getSource() == loginTemplate.getbEntrar()) {
            enviarDatosUsuario();
        } else if (e.getSource() == loginTemplate.getbCerrar()) {
            System.exit(0);
        } else if (e.getSource() == loginTemplate.getBMinimizar()) {
            loginTemplate.setExtendedState(Frame.ICONIFIED);;
        }
    }

    private void entrar() {       

        VistaPrincipalComponent vistaPrincipalComponent = new VistaPrincipalComponent();
        loginTemplate.setVisible(false);
    }

    public void moverVentana(int x, int y) {
        loginTemplate.setLocation(x, y);
    }

    private void enviarDatosUsuario() {
        String nombre = loginTemplate.gettNombreUsuario().getText();
        String clave = new String(loginTemplate.gettClaveUsuario().getPassword());

        if (sUsuario.verificarUsuario(nombre, clave)) 
            entrar();
        else
            JOptionPane.showMessageDialog(null, "Revisa tu usuario y tu contraseña", "Datos incorrectos", 2);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton boton;
            boton = (JButton) e.getSource();
            boton.setForeground(RecursosService.getService().getColorDespacoLogin());
        } else if (e.getSource() instanceof JCheckBox) {
            JCheckBox check = (JCheckBox) e.getSource();
            check.setForeground(RecursosService.getService().getColorDespacoLogin());
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton boton;
            boton = (JButton) e.getSource();
            boton.setForeground(RecursosService.getService().getColorFontOp());
        } else if (e.getSource() instanceof JCheckBox) {
            JCheckBox check = (JCheckBox) e.getSource();
            if (!check.isSelected())
                check.setForeground(RecursosService.getService().getColorFontOp());
        }

    }

    @Override
    public void focusGained(FocusEvent e) {
        if (e.getSource() == loginTemplate.gettNombreUsuario()) {
            if (loginTemplate.gettNombreUsuario().getText().equals("NOMBRE DE USUARIO"))
                loginTemplate.gettNombreUsuario().setText("");

            loginTemplate.gettNombreUsuario().setBorder(RecursosService.getService().getBordeTxtLogin());
            loginTemplate.gettNombreUsuario().setFont(RecursosService.getService().getFontTypol15());
            loginTemplate.gettNombreUsuario().setForeground(RecursosService.getService().getColorDespacoLogin());
            loginTemplate.gettNombreUsuario().setBackground(null);
        } else if (e.getSource() == loginTemplate.gettClaveUsuario()) {
            if (new String(loginTemplate.gettClaveUsuario().getPassword()).equals("Contraseña"))
                loginTemplate.gettClaveUsuario().setText("");

            loginTemplate.gettClaveUsuario().setBorder(RecursosService.getService().getBordeTxtLogin());
            loginTemplate.gettClaveUsuario().setFont(RecursosService.getService().getFontTypol15());
            loginTemplate.gettClaveUsuario().setForeground(RecursosService.getService().getColorDespacoLogin());
            loginTemplate.gettClaveUsuario().setBackground(null);
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (e.getSource() == loginTemplate.gettNombreUsuario()) {
            if (loginTemplate.gettNombreUsuario().getText().equals("")) {
                loginTemplate.gettNombreUsuario().setText("NOMBRE DE USUARIO");
                loginTemplate.gettNombreUsuario().setFont(RecursosService.getService().getFontSecundaria());
                loginTemplate.gettNombreUsuario().setForeground(RecursosService.getService().getColorFontOp());
            }
            loginTemplate.gettNombreUsuario().setBorder(null);
            loginTemplate.gettNombreUsuario().setBackground(RecursosService.getService().getColorFndoCampos());
        } else if (e.getSource() == loginTemplate.gettClaveUsuario()) {
            if (new String(loginTemplate.gettClaveUsuario().getPassword()).equals("")) {
                loginTemplate.gettClaveUsuario().setText("Contraseña");
                loginTemplate.gettClaveUsuario().setFont(RecursosService.getService().getFontSecundaria());
                loginTemplate.gettClaveUsuario().setForeground(RecursosService.getService().getColorFontOp());
            }
            loginTemplate.gettClaveUsuario().setBorder(null);
            loginTemplate.gettClaveUsuario().setBackground(RecursosService.getService().getColorFndoCampos());
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        
        moverVentana(e.getXOnScreen() - x, e.getYOnScreen() - y);
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

}
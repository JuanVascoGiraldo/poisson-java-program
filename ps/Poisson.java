package ps;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.CropImageFilter;
import java.beans.Expression;
import static java.lang.Double.parseDouble;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.lang.Math;

public class Poisson extends JFrame{
    
    
    private static JPanel panel1, panel2, panel3, panel4, panel5;
    private static String type = "", tipotext="___", cantidadtext="___", x_str="___", n_str="___";
    private static int promedio = 0;
    private JTextArea instrucciones, instruccionesp3, instruccionesp4, instruccionesp5, response;
    private JTextField respuesta, cantidadfild, x_flied, n_flied;
    private ImageIcon img1, img2, img3, img4, img5;
    private JButton boton1 = new JButton();
    private int rgb1 = Color.decode("#7209b7").getRGB();
    private int rgb2 = Color.decode("#9d0208").getRGB();
    private int rgb3 = Color.decode("#5b8e7d").getRGB();
    private int rgb4 = Color.decode("#590d22").getRGB();
    private Color color1 = new Color(2, 48, 71);
    private Color color2 = new Color(rgb1);
    private Color color3 = new Color(rgb2);
    private Color color4 = new Color(rgb3);
    private Color color5 = new Color(rgb4);
    private JComboBox<String> tipo;
    private JLabel tip, cant;

    public Poisson(){
        this.setSize(500,500);
        this.setTitle("Poisson Distribution");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        ImageIcon icono = new ImageIcon("images/Chefsito.png");
        Image Logo= icono.getImage();
        this.setIconImage(Logo);
        iniciarcomponentes();
    }

    private void iniciarcomponentes() {
        Paneles();
        text_field();
        Etiquetas();
        Botones();
        images();
        jcombo_box();
    }

    private void Paneles(){
        panel1= new JPanel();
        panel1.setLayout(null);
        panel1.setBackground(color1);
        panel1.setBounds(0, 0, 500, 500);
        panel1.setVisible(true);
        this.getContentPane().add(panel1);

        panel2= new JPanel();
        panel2.setLayout(null);
        panel2.setBackground(color2);
        panel2.setBounds(0, 0, 500, 500);
        panel2.setVisible(false);
        this.getContentPane().add(panel2);

        panel3= new JPanel();
        panel3.setLayout(null);
        panel3.setBackground(color3);
        panel3.setBounds(0, 0, 500, 500);
        panel3.setVisible(false);
        this.getContentPane().add(panel3);

        panel4= new JPanel();
        panel4.setLayout(null);
        panel4.setBackground(color4);
        panel4.setBounds(0, 0, 500, 500);
        panel4.setVisible(false);
        this.getContentPane().add(panel4);

        panel5= new JPanel();
        panel5.setLayout(null);
        panel5.setBackground(color5);
        panel5.setBounds(0, 0, 500, 500);
        panel5.setVisible(false);
        this.getContentPane().add(panel5);
    }

    private void set_images(){
        img1 = new ImageIcon("images/Chefsito.png");
        img2 = new ImageIcon("images/Aguacate.png");
        img3 = new ImageIcon("images/Calabaza.png");
        img4 = new ImageIcon("images/Jitomate.png");
        img5 = new ImageIcon("images/Limon.png");

    }

    private void images(){
        set_images();
        JLabel imagen1 = new JLabel();
        imagen1.setBounds(200, 300, 100, 100);
        imagen1.setIcon(new ImageIcon(img1.getImage().getScaledInstance(imagen1.getWidth(), imagen1.getHeight(), Image.SCALE_SMOOTH)));
        panel1.add(imagen1);

        JLabel imagen11 = new JLabel();
        imagen11.setBounds(400, 300, 100, 100);
        imagen11.setIcon(new ImageIcon(img1.getImage().getScaledInstance(imagen11.getWidth(), imagen11.getHeight(), Image.SCALE_SMOOTH)));
        panel1.add(imagen11);
        
        JLabel imagen12 = new JLabel();
        imagen12.setBounds(0, 300, 100, 100);
        imagen12.setIcon(new ImageIcon(img1.getImage().getScaledInstance(imagen12.getWidth(), imagen12.getHeight(), Image.SCALE_SMOOTH)));
        panel1.add(imagen12);

        JLabel imagen2 = new JLabel();
        imagen2.setBounds(100, 300, 100, 100);
        imagen2.setIcon(new ImageIcon(img2.getImage().getScaledInstance(imagen2.getWidth(), imagen2.getHeight(), Image.SCALE_SMOOTH)));
        panel1.add(imagen2);
        
        JLabel imagen3 = new JLabel();
        imagen3.setBounds(300, 300, 100, 100);
        imagen3.setIcon(new ImageIcon(img3.getImage().getScaledInstance(imagen3.getWidth(), imagen3.getHeight(), Image.SCALE_SMOOTH)));
        panel1.add(imagen3);

        JLabel imagen4 = new JLabel();
        imagen4.setBounds(390, 190, 100, 100);
        imagen4.setIcon(new ImageIcon(img4.getImage().getScaledInstance(imagen4.getWidth(), imagen4.getHeight(), Image.SCALE_SMOOTH)));
        panel1.add(imagen4);
        
        JLabel imagen5 = new JLabel();
        imagen5.setBounds(10, 190, 100, 100);
        imagen5.setIcon(new ImageIcon(img5.getImage().getScaledInstance(imagen5.getWidth(), imagen5.getHeight(), Image.SCALE_SMOOTH)));
        panel1.add(imagen5);

        ImageIcon img21 = new ImageIcon("images/Cebolla.png");
        JLabel imagen21 = new JLabel();
        imagen21.setBounds(25, 80, 100, 100); 
        imagen21.setIcon(new ImageIcon(img21.getImage().getScaledInstance(imagen21.getWidth(), imagen21.getHeight(), Image.SCALE_SMOOTH)));
        panel2.add(imagen21);

        ImageIcon img22 = new ImageIcon("images/Chicharos.png");
        JLabel imagen22 = new JLabel();
        imagen22.setBounds(25, 180, 100, 100);
        imagen22.setIcon(new ImageIcon(img22.getImage().getScaledInstance(imagen22.getWidth(), imagen22.getHeight(), Image.SCALE_SMOOTH)));
        panel2.add(imagen22);

        ImageIcon img23 = new ImageIcon("images/Pepino.png");
        JLabel imagen23 = new JLabel();
        imagen23.setBounds(25, 280, 100, 100);
        imagen23.setIcon(new ImageIcon(img23.getImage().getScaledInstance(imagen23.getWidth(), imagen23.getHeight(), Image.SCALE_SMOOTH)));
        panel2.add(imagen23);
    }

    private void Etiquetas(){
        JLabel titulo = new JLabel("Problema del chef",  SwingConstants.CENTER);
        titulo.setBounds(0, 20, 500, 35);
        titulo.setFont(new Font("Arial", Font.BOLD, 30));
        titulo.setForeground(Color.WHITE);
        panel1.add(titulo);

        instrucciones= new JTextArea("El chef de un restaurante prepara una ensalada revuelta que contiene, en promedio, ___ vegetales.");
        instrucciones.setBounds(50, 80, 400, 100);
        instrucciones.setFont(new Font("Arial", Font.PLAIN, 20));
        instrucciones.setForeground(Color.WHITE);
        instrucciones.setBackground(color1);
        instrucciones.setLineWrap(true);
        instrucciones.setWrapStyleWord(true);
        instrucciones.setEditable(false);
        panel1.add(instrucciones);

        JLabel titulo2 = new JLabel("Ingresa el promedio",  SwingConstants.CENTER);
        titulo2.setBounds(50, 180, 400, 35);
        titulo2.setFont(new Font("Arial", Font.BOLD, 18));
        titulo2.setForeground(Color.WHITE);
        panel1.add(titulo2);

        JLabel titulojp2 = new JLabel("Preguntas",  SwingConstants.CENTER);
        titulojp2.setBounds(0, 20, 500, 35);
        titulojp2.setFont(new Font("Arial", Font.BOLD, 25));
        titulojp2.setForeground(Color.WHITE);
        panel2.add(titulojp2);

        JTextArea instrucciones2= new JTextArea("1. ¿Cuál es la probabilidad de que el chef prepare una ensalada con cierta cantidad de vegetales?");
        instrucciones2.setBounds(150, 80, 300, 100);
        instrucciones2.setFont(new Font("Arial", Font.PLAIN, 18));
        instrucciones2.setForeground(Color.WHITE);
        instrucciones2.setBackground(color2);
        instrucciones2.setLineWrap(true);
        instrucciones2.setWrapStyleWord(true);
        instrucciones2.setEditable(false);
        instrucciones2.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e){
                set_type("1");
            }
            @Override
            public void mousePressed(MouseEvent e){}
            @Override
            public void mouseReleased(MouseEvent e){}
            @Override
            public void mouseEntered(MouseEvent e){
                instrucciones2.setBorder(BorderFactory.createLineBorder(Color.WHITE));
            }
            @Override
            public void mouseExited(MouseEvent e){
                instrucciones2.setBorder(BorderFactory.createLineBorder(color2));
            }
        });
        panel2.add(instrucciones2);

        JTextArea instrucciones3= new JTextArea("2. ¿Cuál es la probabilidad de que el chef prepare una ensalada con cierta cantidad de vegetales x dias de n?");
        instrucciones3.setBounds(150, 180, 300, 100);
        instrucciones3.setFont(new Font("Arial", Font.PLAIN, 18));
        instrucciones3.setForeground(Color.WHITE);
        instrucciones3.setBackground(color2);
        instrucciones3.setLineWrap(true);
        instrucciones3.setWrapStyleWord(true);
        instrucciones3.setEditable(false);
        instrucciones3.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e){
                set_type("2");
            }
            @Override
            public void mousePressed(MouseEvent e){}
            @Override
            public void mouseReleased(MouseEvent e){}
            @Override
            public void mouseEntered(MouseEvent e){
                instrucciones3.setBorder(BorderFactory.createLineBorder(Color.WHITE));
            }
            @Override
            public void mouseExited(MouseEvent e){
                instrucciones3.setBorder(BorderFactory.createLineBorder(color2));
            }
        });
        panel2.add(instrucciones3);

        JTextArea instrucciones4= new JTextArea("3. ¿Cuál es la probabilidad de que el chef prepare una ensalada con cierta cantidad de vegetalespor primera vez despues de n dias?");
        instrucciones4.setBounds(150, 280, 300, 100);
        instrucciones4.setFont(new Font("Arial", Font.PLAIN, 18));
        instrucciones4.setForeground(Color.WHITE);
        instrucciones4.setBackground(color2);
        instrucciones4.setLineWrap(true);
        instrucciones4.setWrapStyleWord(true);
        instrucciones4.setEditable(false);
        instrucciones4.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e){
                set_type("3");
            }
            @Override
            public void mousePressed(MouseEvent e){}
            @Override
            public void mouseReleased(MouseEvent e){}
            @Override
            public void mouseEntered(MouseEvent e){
                instrucciones4.setBorder(BorderFactory.createLineBorder(Color.WHITE));
            }
            @Override
            public void mouseExited(MouseEvent e){
                instrucciones4.setBorder(BorderFactory.createLineBorder(color2));
            }
        });
        panel2.add(instrucciones4);


        instruccionesp3= new JTextArea("¿Cuál es la probabilidad de que el chef prepare una ensalada con una cantidad ___ a ___ ?");
        instruccionesp3.setBounds(50, 30, 400, 100);
        instruccionesp3.setFont(new Font("Arial", Font.PLAIN, 20));
        instruccionesp3.setForeground(Color.WHITE);
        instruccionesp3.setBackground(color3);
        instruccionesp3.setLineWrap(true);
        instruccionesp3.setWrapStyleWord(true);
        instruccionesp3.setEditable(false);
        panel3.add(instruccionesp3);

        instruccionesp4= new JTextArea("¿Cuál es la probabilidad de que el chef prepare una ensalada con una cantidad ___ a ___ , ___ dias de ___ dias?");
        instruccionesp4.setBounds(50, 30, 400, 100);
        instruccionesp4.setFont(new Font("Arial", Font.PLAIN, 20));
        instruccionesp4.setForeground(Color.WHITE);
        instruccionesp4.setBackground(color4);
        instruccionesp4.setLineWrap(true);
        instruccionesp4.setWrapStyleWord(true);
        instruccionesp4.setEditable(false);
        panel4.add(instruccionesp4);
        
        instruccionesp5= new JTextArea("¿Cuál es la probabilidad de que el chef prepare una ensalada con una cantidad ___ a ___ , por primera vez al ___ dias?");
        instruccionesp5.setBounds(50, 30, 400, 100);
        instruccionesp5.setFont(new Font("Arial", Font.PLAIN, 20));
        instruccionesp5.setForeground(Color.WHITE);
        instruccionesp5.setBackground(color5);
        instruccionesp5.setLineWrap(true);
        instruccionesp5.setWrapStyleWord(true);
        instruccionesp5.setEditable(false);
        panel5.add(instruccionesp5);

        tip = new JLabel("Tipo: ",  SwingConstants.CENTER);
        tip.setBounds(50, 130, 100, 35);
        tip.setFont(new Font("Arial", Font.BOLD, 18));
        tip.setForeground(Color.WHITE);
        
        cant = new JLabel("Cantidad: ",  SwingConstants.CENTER);
        cant.setBounds(50, 180, 100, 35);
        cant.setFont(new Font("Arial", Font.BOLD, 18));
        cant.setForeground(Color.WHITE);

        JLabel dias = new JLabel("Dias: ",  SwingConstants.CENTER);
        dias.setBounds(10, 230, 80, 35);
        dias.setFont(new Font("Arial", Font.BOLD, 18));
        dias.setForeground(Color.WHITE);
        panel4.add(dias);

        JLabel cuanto = new JLabel("Cuantos: ",  SwingConstants.CENTER);
        cuanto.setBounds(230, 230, 90, 50);
        cuanto.setFont(new Font("Arial", Font.BOLD, 18));
        cuanto.setForeground(Color.WHITE);
        panel4.add(cuanto);

        JLabel descuanto = new JLabel("Despues de estos dias: ",  SwingConstants.CENTER);
        descuanto.setBounds(70, 230, 250, 50);
        descuanto.setFont(new Font("Arial", Font.BOLD, 18));
        descuanto.setForeground(Color.WHITE);
        panel5.add(descuanto);
        
        response = new JTextArea("La probabilidad es de: ");
        response.setBounds(50, 320, 400, 60);
        response.setFont(new Font("Arial", Font.PLAIN, 20));
        response.setForeground(Color.WHITE);
        response.setLineWrap(true);
        response.setWrapStyleWord(true);
        response.setEditable(false);

    }

    private void jcombo_box(){
        String[] tipos = {"", "Mayor", "Menor", "Igual", "Mayor igual", "Menor igual", "Diferente"};
        tipo = new JComboBox<>(tipos);
        tipo.setBounds(150, 130, 200, 35);
        tipo.setFont(new Font("Arial", Font.PLAIN, 18));
        tipo.setForeground(Color.WHITE);
        tipo.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        tipo.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JComboBox cb = (JComboBox)e.getSource();
                String selected = (String)cb.getSelectedItem();
                if (selected != ""){
                    tipotext = selected;
                    set_text_in_text_area_p3();
                }
                
            }
        });
    }

    private void text_field(){
        respuesta = new JTextField();
        respuesta.setBounds(150, 250, 200, 35);
        respuesta.setFont(new Font("Arial", Font.PLAIN, 24));
        respuesta.setBackground(color1);
        respuesta.setForeground(Color.WHITE);
        respuesta.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        respuesta.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e){
                char c = e.getKeyChar();
                if(c<'0' || c>'9') e.consume();
                if (respuesta.getText().length() >= 6 ) // limit textfield to 2 characters
                    e.consume();
            }
            @Override
            public void keyPressed(KeyEvent e){}
            @Override
            public void keyReleased(KeyEvent e){
                String text = respuesta.getText();
                set_text_in_text_area(text);
            }
        });
        respuesta.requestFocus();
        panel1.add(respuesta);


        cantidadfild = new JTextField();
        cantidadfild.setBounds(150, 180, 200, 35);
        cantidadfild.setFont(new Font("Arial", Font.PLAIN, 24));
        cantidadfild.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        cantidadfild.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e){
                char c = e.getKeyChar();
                if(c<'0' || c>'9') e.consume();
                if (cantidadfild.getText().length() >= 6 ) // limit textfield to 2 characters
                e.consume();
            }
            @Override
            public void keyPressed(KeyEvent e){}
            @Override
            public void keyReleased(KeyEvent e){
                String text = cantidadfild.getText();
                cantidadtext = text;
                set_text_in_text_area_p3();
            }
        });

        x_flied = new JTextField();
        x_flied.setBounds(100, 230, 100, 35);
        x_flied.setFont(new Font("Arial", Font.PLAIN, 24));
        x_flied.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        x_flied.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e){
                char c = e.getKeyChar();
                if(c<'0' || c>'9') e.consume();
                if (x_flied.getText().length() >= 6 ) // limit textfield to 2 characters
                e.consume();
            }
            @Override
            public void keyPressed(KeyEvent e){}
            @Override
            public void keyReleased(KeyEvent e){
                String text = x_flied.getText();
                x_str = text;
                set_text_in_text_area_p3();
            }
        });

        n_flied = new JTextField();
        n_flied.setBounds(330, 230, 100, 35);
        n_flied.setFont(new Font("Arial", Font.PLAIN, 24));
        n_flied.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        n_flied.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e){
                char c = e.getKeyChar();
                if(c<'0' || c>'9') e.consume();
                if (n_flied.getText().length() >= 6 ) // limit textfield to 2 characters
                e.consume();
            }
            @Override
            public void keyPressed(KeyEvent e){}
            @Override
            public void keyReleased(KeyEvent e){
                String text = n_flied.getText();
                n_str = text;
                set_text_in_text_area_p3();
            }
        });
    }

    private void validate_prom(){
        String text = respuesta.getText();
        if(text.length() == 0){
            JOptionPane.showMessageDialog(null, "Por favor ingresa un valor", "Ingresa informacion valida", JOptionPane.INFORMATION_MESSAGE);
        }else{
            promedio = Integer.parseInt(text);
            panel1.setVisible(false);
            panel2.setVisible(true);
        }
    }

    private void set_type(String t){
        type = t;
        response.setText("La probabilidad es de: ");
        cantidadfild.setText("");
        tipo.setSelectedIndex(0);
        x_flied.setText("");
        n_flied.setText("");
        x_str = "___";
        n_str = "___";
        tipotext = "___";
        cantidadtext = "___";
        if (t == "1"){
            panel2.setVisible(false);
            panel3.add(cant);
            panel3.add(tip);
            response.setBackground(color3);
            panel3.add(cantidadfild);
            panel3.add(response);
            tipo.setBackground(color3);
            panel3.add(tipo);
            panel3.setVisible(true);
        }
        if (t == "2"){
            panel2.setVisible(false);
            panel4.add(cant);
            panel4.add(tip);
            panel4.add(cantidadfild);
            response.setBackground(color4);
            panel4.add(response);
            tipo.setBackground(color4);
            panel4.add(tipo);
            panel4.setVisible(true);
            panel4.add(x_flied);
            panel4.add(n_flied);
        }

        if (t == "3"){
            panel2.setVisible(false);
            panel2.setVisible(false);
            panel5.add(cant);
            panel5.add(tip);
            panel5.add(cantidadfild);
            response.setBackground(color5);
            panel5.add(response);
            tipo.setBackground(color5);
            panel5.add(tipo);
            panel5.setVisible(true);
            panel5.add(n_flied);
            panel5.setVisible(true);
        }
    }

    private void volver(){
        if (type == "1"){
            panel3.setVisible(false);
            panel2.setVisible(true);
        }

        if (type == "2"){
            panel4.setVisible(false);
            panel2.setVisible(true);
        }

        if (type == "3"){
            panel5.setVisible(false);
            panel2.setVisible(true);
        }

        type = "";
    }

    private void volver2 (){
        panel2.setVisible(false);
        panel1.setVisible(true);
    }

    private void Botones(){
        ImageIcon imgb1 = new ImageIcon("images/button_continuar.png");
        boton1.setBounds(200, 420, 100, 33);
        boton1.setIcon(new ImageIcon(imgb1.getImage().getScaledInstance(boton1.getWidth(), boton1.getHeight(), Image.SCALE_SMOOTH)));
        boton1.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        boton1.setFocusPainted(false);
        boton1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                validate_prom();
            }
        });
        panel1.add(boton1);

        ImageIcon imgb2 = new ImageIcon("images/button_volver.png");
        ImageIcon imgb3 = new ImageIcon("images/button_calcular.png");
        JButton boton2 = new JButton();
        boton2.setBounds(150, 400, 86, 50);
        boton2.setIcon(new ImageIcon(imgb2.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
        boton2.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        boton2.setFocusPainted(false);
        boton2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                volver2();
            }
        });
        panel2.add(boton2);
        

        JButton boton3 = new JButton();
        boton3.setBounds(140, 400, 86, 50);
        boton3.setIcon(new ImageIcon(imgb2.getImage().getScaledInstance(boton3.getWidth(), boton3.getHeight(), Image.SCALE_SMOOTH)));
        boton3.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        boton3.setFocusPainted(false);
        boton3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                volver();
            }
        });
        panel3.add(boton3);

        JButton boton32 = new JButton();
        boton32.setBounds(140, 400, 86, 50);
        boton32.setIcon(new ImageIcon(imgb2.getImage().getScaledInstance(boton32.getWidth(), boton32.getHeight(), Image.SCALE_SMOOTH)));
        boton32.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        boton32.setFocusPainted(false);
        boton32.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                volver();
            }
        });
        
        panel4.add(boton32);

        JButton boton33 = new JButton();
        boton33.setBounds(140, 400, 86, 50);
        boton33.setIcon(new ImageIcon(imgb2.getImage().getScaledInstance(boton33.getWidth(), boton33.getHeight(), Image.SCALE_SMOOTH)));
        boton33.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        boton33.setFocusPainted(false);
        boton33.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                volver();
            }
        });

        panel5.add(boton33);

        JButton boton4 = new JButton();
        boton4.setBounds(300, 400, 98, 50);
        boton4.setIcon(new ImageIcon(imgb3.getImage().getScaledInstance(boton4.getWidth(), boton4.getHeight(), Image.SCALE_SMOOTH)));
        boton4.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        boton4.setFocusPainted(false);
        boton4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                calculte();
            }
        });
        panel3.add(boton4);

        JButton boton42 = new JButton();
        boton42.setBounds(300, 400, 98, 50);
        boton42.setIcon(new ImageIcon(imgb3.getImage().getScaledInstance(boton42.getWidth(), boton42.getHeight(), Image.SCALE_SMOOTH)));
        boton42.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        boton42.setFocusPainted(false);
        boton42.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                calculte();
            }
        });
        panel4.add(boton42);

        JButton boton43 = new JButton();
        boton43.setBounds(300, 400, 98, 50);
        boton43.setIcon(new ImageIcon(imgb3.getImage().getScaledInstance(boton43.getWidth(), boton43.getHeight(), Image.SCALE_SMOOTH)));
        boton43.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        boton43.setFocusPainted(false);
        boton43.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                calculte();
            }
        });
        panel5.add(boton43);
    }

    private void set_text_in_text_area(String promedio){
        String text_to_send = "El chef de un restaurante prepara una ensalada revuelta que contiene, en promedio, " + promedio + " vegetales.";
        instrucciones.setText(text_to_send);
    }

    private void set_text_in_text_area_p3(){
        if (type == "1"){
            String text_to_send = "¿Cuál es la probabilidad de que el chef prepare una ensalada con una cantidad "+ tipotext + " a " + cantidadtext +" ?";
            instruccionesp3.setText(text_to_send);
        }
        if (type == "2"){
            String text_to_send = "¿Cuál es la probabilidad de que el chef prepare una ensalada con una cantidad "+ tipotext + " a " + cantidadtext +", "+ x_str+" dias de "+n_str+" ?";
            instruccionesp4.setText(text_to_send);
        }
        if (type == "3"){
            String text_to_send = "¿Cuál es la probabilidad de que el chef prepare una ensalada con una cantidad "+ tipotext + " a " + cantidadtext +", por primera vez al "+n_str+" dias?";
            instruccionesp5.setText(text_to_send);
        }
    }

    private void calculte(){

        if(cantidadtext == "___" || cantidadtext == ""){
            JOptionPane.showMessageDialog(null, "Por favor ingresa un valor", "Ingresa informacion valida", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        if(tipotext == "___" || tipotext == ""){
            JOptionPane.showMessageDialog(null, "Por favor ingresa un valor", "Ingresa informacion valida", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        double probabilidadfinal = 0.0;

        if (type == "1"){
            probabilidadfinal = basic_poisson(); //Probabilidad poisson
        }
        if (type == "2"){
            probabilidadfinal = basic_poisson();
            if (x_str == "___" || n_str == "___" || x_str == "" || n_str == ""){
                JOptionPane.showMessageDialog(null, "Por favor ingresa un valor", "Ingresa informacion valida", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            int x = Integer.parseInt(x_str);
            int n = Integer.parseInt(n_str);
            if (x > n){
                JOptionPane.showMessageDialog(null, "x debe ser menor o igual n", "Ingresa informacion valida", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            int combinacion = combinacion(n, x);
            probabilidadfinal = Math.pow(probabilidadfinal, x)* Math.pow(1-probabilidadfinal, n-x) * combinacion; //Probabilidad binomial
        }
        if (type == "3"){
            probabilidadfinal = basic_poisson();
            if (n_str == "___" || n_str == ""){
                JOptionPane.showMessageDialog(null, "Por favor ingresa un valor", "Ingresa informacion valida", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            int n = Integer.parseInt(n_str);
            probabilidadfinal = Math.pow(probabilidadfinal, n-1) * (1-probabilidadfinal); //Probabilidad geometrica
        }

        response.setText("La probabilidad es de: " + probabilidadfinal);
    }

    private double basic_poisson(){
        double probabilidadfinal = 0.0;
        double lambda = Double.parseDouble(String.valueOf(promedio));
        int k = Integer.parseInt(cantidadtext);
        if( tipotext == "Mayor"){
            double probabilidad = 0.0;
            for (int i = 0; i <= k; i++) {
                probabilidad += calcularPoisson(lambda, i);
            }
            probabilidadfinal = 1 - probabilidad;
        }
        if (tipotext == "Menor"){
            double probabilidad = 0.0;
            for (int i = 0; i < k; i++) {
                probabilidad += calcularPoisson(lambda, i);
            }
            probabilidadfinal = probabilidad;
        }
        if (tipotext == "Igual"){
            probabilidadfinal = calcularPoisson(lambda, k);
        }

        if (tipotext == "Mayor igual"){
            double probabilidad = 0.0;
            for (int i = 0; i < k; i++) {
                probabilidad += calcularPoisson(lambda, i);
            }
            probabilidadfinal = 1 - probabilidad;
        }

        if (tipotext == "Menor igual"){
            double probabilidad = 0.0;
            for (int i = 0; i <= k; i++) {
                probabilidad += calcularPoisson(lambda, i);
            }
            probabilidadfinal = probabilidad;
        }

        if (tipotext == "Diferente"){
            double probabilidad = 0.0;
            for (int i = 0; i <= k; i++) {
                probabilidad += calcularPoisson(lambda, i);
            }
            probabilidadfinal = 1 - probabilidad;
        }
        return probabilidadfinal;
    }

    private int combinacion(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    private int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    private static double calcularPoisson(double lambda, int k) {
        // Calcular e^(-lambda)
        double parte1 = Math.exp(-lambda);
        
        // Calcular lambda^k
        double parte2 = Math.pow(lambda, k);
        
        // Calcular k factorial
        int factorialK = 1;
        for (int i = 1; i <= k; i++) {
            factorialK *= i;
        }
        
        // Calcular la probabilidad de Poisson
        double probabilidad = (parte1 * parte2) / factorialK;
        
        return probabilidad;
    }
}

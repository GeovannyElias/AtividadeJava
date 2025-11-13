package model;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class TelaEmpresa extends JFrame {

    private Empresa empresa = new Empresa();
    private JTextField txtNomeCliente, txtEmailCliente;
    private JTextField txtNomeFunc, txtCargoFunc, txtSalarioFunc;
    private JTextArea areaExibicao;

    // Paleta de cores moderna
    private final Color COR_PRIMARIA = new Color(79, 70, 229);      // Índigo vibrante
    private final Color COR_SECUNDARIA = new Color(99, 102, 241);   // Índigo claro
    private final Color COR_SUCESSO = new Color(16, 185, 129);      // Verde esmeralda
    private final Color COR_FUNDO = new Color(15, 23, 42);          // Azul escuro profundo
    private final Color COR_CARD = new Color(30, 41, 59);           // Cinza azulado
    private final Color COR_TEXTO = new Color(241, 245, 249);       // Branco suave
    private final Color COR_TEXTO_SEC = new Color(148, 163, 184);   // Cinza claro

    public TelaEmpresa() {
        setTitle("Sistema Empresarial | Dashboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(650, 800);
        setLayout(new BorderLayout());
        
        // Painel principal com gradiente
        JPanel painelPrincipal = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                GradientPaint gp = new GradientPaint(0, 0, COR_FUNDO, 0, getHeight(), new Color(30, 41, 59));
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        painelPrincipal.setLayout(new BorderLayout());

        // Cabeçalho estiloso
        JPanel cabecalho = criarCabecalho();
        painelPrincipal.add(cabecalho, BorderLayout.NORTH);

        // Painel de conteúdo
        JPanel painelConteudo = new JPanel();
        painelConteudo.setOpaque(false);
        painelConteudo.setLayout(new BoxLayout(painelConteudo, BoxLayout.Y_AXIS));
        painelConteudo.setBorder(BorderFactory.createEmptyBorder(30, 40, 30, 40));

        // Seção de Clientes
        painelConteudo.add(criarSecaoClientes());
        painelConteudo.add(Box.createRigidArea(new Dimension(0, 25)));

        // Seção de Funcionários
        painelConteudo.add(criarSecaoFuncionarios());
        painelConteudo.add(Box.createRigidArea(new Dimension(0, 25)));

        // Seção de Relatórios
        painelConteudo.add(criarSecaoRelatorios());
        painelConteudo.add(Box.createRigidArea(new Dimension(0, 25)));

        // Área de exibição moderna
        painelConteudo.add(criarAreaExibicao());

        JScrollPane scrollTela = new JScrollPane(painelConteudo);
        scrollTela.setOpaque(false);
        scrollTela.getViewport().setOpaque(false);
        scrollTela.setBorder(null);
        scrollTela.getVerticalScrollBar().setUnitIncrement(16);
        
        painelPrincipal.add(scrollTela, BorderLayout.CENTER);
        add(painelPrincipal);
        
        setLocationRelativeTo(null);
    }

    private JPanel criarCabecalho() {
        JPanel cabecalho = new JPanel();
        cabecalho.setBackground(new Color(17, 24, 39));
        cabecalho.setPreferredSize(new Dimension(650, 80));
        cabecalho.setLayout(new BorderLayout());
        cabecalho.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createMatteBorder(0, 0, 2, 0, COR_PRIMARIA),
            BorderFactory.createEmptyBorder(20, 30, 20, 30)
        ));

        JLabel titulo = new JLabel("⚡ Enterprise Manager");
        titulo.setFont(new Font("Segoe UI", Font.BOLD, 28));
        titulo.setForeground(COR_TEXTO);
        
        JLabel subtitulo = new JLabel("Sistema Integrado de Gestão");
        subtitulo.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        subtitulo.setForeground(COR_TEXTO_SEC);
        
        JPanel painelTitulos = new JPanel();
        painelTitulos.setOpaque(false);
        painelTitulos.setLayout(new BoxLayout(painelTitulos, BoxLayout.Y_AXIS));
        painelTitulos.add(titulo);
        painelTitulos.add(subtitulo);
        
        cabecalho.add(painelTitulos, BorderLayout.WEST);
        
        return cabecalho;
    }

    private JPanel criarSecaoClientes() {
        JPanel secao = criarCardSecao("👥 Cadastro de Clientes");
        
        txtNomeCliente = criarCampoTextoModerno("Digite o nome completo");
        txtEmailCliente = criarCampoTextoModerno("exemplo@email.com");
        
        secao.add(criarLabelModerno("Nome do Cliente"));
        secao.add(Box.createRigidArea(new Dimension(0, 5)));
        secao.add(txtNomeCliente);
        secao.add(Box.createRigidArea(new Dimension(0, 12)));
        
        secao.add(criarLabelModerno("E-mail"));
        secao.add(Box.createRigidArea(new Dimension(0, 5)));
        secao.add(txtEmailCliente);
        secao.add(Box.createRigidArea(new Dimension(0, 15)));
        
        JButton btnAddCliente = criarBotaoPrimario("➕ Adicionar Cliente");
        btnAddCliente.addActionListener(e -> adicionarCliente());
        secao.add(btnAddCliente);
        
        return secao;
    }

    private JPanel criarSecaoFuncionarios() {
        JPanel secao = criarCardSecao("💼 Cadastro de Funcionários");
        
        txtNomeFunc = criarCampoTextoModerno("Digite o nome completo");
        txtCargoFunc = criarCampoTextoModerno("Ex: Desenvolvedor");
        txtSalarioFunc = criarCampoTextoModerno("0.00");
        
        secao.add(criarLabelModerno("Nome do Funcionário"));
        secao.add(Box.createRigidArea(new Dimension(0, 5)));
        secao.add(txtNomeFunc);
        secao.add(Box.createRigidArea(new Dimension(0, 12)));
        
        secao.add(criarLabelModerno("Cargo"));
        secao.add(Box.createRigidArea(new Dimension(0, 5)));
        secao.add(txtCargoFunc);
        secao.add(Box.createRigidArea(new Dimension(0, 12)));
        
        secao.add(criarLabelModerno("Salário (R$)"));
        secao.add(Box.createRigidArea(new Dimension(0, 5)));
        secao.add(txtSalarioFunc);
        secao.add(Box.createRigidArea(new Dimension(0, 15)));
        
        JButton btnAddFunc = criarBotaoPrimario("➕ Adicionar Funcionário");
        btnAddFunc.addActionListener(e -> adicionarFuncionario());
        secao.add(btnAddFunc);
        
        return secao;
    }

    private JPanel criarSecaoRelatorios() {
        JPanel secao = criarCardSecao("📊 Relatórios Financeiros");
        
        JPanel painelBotoes = new JPanel();
        painelBotoes.setOpaque(false);
        painelBotoes.setLayout(new GridLayout(1, 2, 15, 0));
        
        JButton btnFolha = criarBotaoSecundario("💰 Folha Salarial");
        btnFolha.addActionListener(e -> calcularFolha());
        
        JButton btnMedia = criarBotaoSecundario("📈 Média Salarial");
        btnMedia.addActionListener(e -> calcularMedia());
        
        painelBotoes.add(btnFolha);
        painelBotoes.add(btnMedia);
        
        secao.add(painelBotoes);
        
        return secao;
    }

    private JPanel criarAreaExibicao() {
        JPanel container = criarCardSecao("📋 Log de Atividades");
        
        areaExibicao = new JTextArea(12, 40);
        areaExibicao.setEditable(false);
        areaExibicao.setLineWrap(true);
        areaExibicao.setWrapStyleWord(true);
        areaExibicao.setFont(new Font("Consolas", Font.PLAIN, 13));
        areaExibicao.setBackground(new Color(15, 23, 42));
        areaExibicao.setForeground(COR_TEXTO);
        areaExibicao.setCaretColor(COR_TEXTO);
        areaExibicao.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        JScrollPane scrollArea = new JScrollPane(areaExibicao);
        scrollArea.setBorder(BorderFactory.createLineBorder(COR_PRIMARIA, 2));
        scrollArea.setPreferredSize(new Dimension(500, 200));
        scrollArea.getViewport().setBackground(new Color(15, 23, 42));
        
        container.add(scrollArea);
        
        return container;
    }

    private JPanel criarCardSecao(String titulo) {
        JPanel card = new JPanel();
        card.setLayout(new BoxLayout(card, BoxLayout.Y_AXIS));
        card.setBackground(COR_CARD);
        card.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(COR_PRIMARIA.darker(), 1),
            BorderFactory.createEmptyBorder(20, 25, 20, 25)
        ));
        card.setMaximumSize(new Dimension(600, 9999));
        card.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        JLabel lblTitulo = new JLabel(titulo);
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 18));
        lblTitulo.setForeground(COR_TEXTO);
        lblTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        card.add(lblTitulo);
        card.add(Box.createRigidArea(new Dimension(0, 15)));
        
        return card;
    }

    private JLabel criarLabelModerno(String texto) {
        JLabel label = new JLabel(texto);
        label.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        label.setForeground(COR_TEXTO_SEC);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        return label;
    }

    private JTextField criarCampoTextoModerno(String placeholder) {
        JTextField campo = new JTextField(20) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (getText().isEmpty() && !hasFocus()) {
                    Graphics2D g2 = (Graphics2D) g.create();
                    g2.setColor(new Color(100, 116, 139));
                    g2.setFont(getFont().deriveFont(Font.ITALIC));
                    g2.drawString(placeholder, 10, 23);
                    g2.dispose();
                }
            }
        };
        
        campo.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        campo.setBackground(new Color(15, 23, 42));
        campo.setForeground(COR_TEXTO);
        campo.setCaretColor(COR_TEXTO);
        campo.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(71, 85, 105), 1),
            BorderFactory.createEmptyBorder(8, 10, 8, 10)
        ));
        campo.setMaximumSize(new Dimension(9999, 38));
        campo.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        // Efeito de foco
        campo.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                campo.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(COR_PRIMARIA, 2),
                    BorderFactory.createEmptyBorder(7, 9, 7, 9)
                ));
            }
            
            @Override
            public void focusLost(FocusEvent e) {
                campo.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(new Color(71, 85, 105), 1),
                    BorderFactory.createEmptyBorder(8, 10, 8, 10)
                ));
            }
        });
        
        return campo;
    }

    private JButton criarBotaoPrimario(String texto) {
        JButton btn = new JButton(texto);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btn.setForeground(Color.WHITE);
        btn.setBackground(COR_PRIMARIA);
        btn.setFocusPainted(false);
        btn.setBorderPainted(false);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn.setAlignmentX(Component.CENTER_ALIGNMENT);
        btn.setMaximumSize(new Dimension(9999, 42));
        
        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btn.setBackground(COR_SECUNDARIA);
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                btn.setBackground(COR_PRIMARIA);
            }
            
            @Override
            public void mousePressed(MouseEvent e) {
                btn.setBackground(COR_PRIMARIA.darker());
            }
            
            @Override
            public void mouseReleased(MouseEvent e) {
                btn.setBackground(COR_SECUNDARIA);
            }
        });
        
        return btn;
    }

    private JButton criarBotaoSecundario(String texto) {
        JButton btn = new JButton(texto);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 13));
        btn.setForeground(COR_TEXTO);
        btn.setBackground(new Color(51, 65, 85));
        btn.setFocusPainted(false);
        btn.setBorderPainted(false);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btn.setBackground(new Color(71, 85, 105));
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                btn.setBackground(new Color(51, 65, 85));
            }
        });
        
        return btn;
    }

    private void adicionarCliente() {
        String nome = txtNomeCliente.getText();
        String email = txtEmailCliente.getText();

        if (nome.isEmpty() || email.isEmpty()) {
            mostrarErro("Preencha todos os campos do cliente!");
            return;
        }

        if (empresa.adicionarCliente(nome, email)) {
            areaExibicao.append("✅ Cliente adicionado: " + nome + " (" + email + ")\n");
            txtNomeCliente.setText("");
            txtEmailCliente.setText("");
            mostrarSucesso("Cliente cadastrado com sucesso!");
        } else {
            mostrarErro("Limite de clientes atingido!");
        }
    }

    private void adicionarFuncionario() {
        try {
            String nome = txtNomeFunc.getText();
            String cargo = txtCargoFunc.getText();
            double salario = Double.parseDouble(txtSalarioFunc.getText());

            if (empresa.adicionarFuncionario(nome, cargo, salario)) {
                areaExibicao.append("✅ Funcionário adicionado: " + nome + " (" + cargo + ") - R$ " + 
                    String.format("%.2f", salario) + "\n");
                txtNomeFunc.setText("");
                txtCargoFunc.setText("");
                txtSalarioFunc.setText("");
                mostrarSucesso("Funcionário cadastrado com sucesso!");
            } else {
                mostrarErro("Limite de funcionários atingido!");
            }
        } catch (NumberFormatException ex) {
            mostrarErro("Salário inválido! Use apenas números.");
        }
    }

    private void calcularFolha() {
        double total = empresa.calcularFolhaSalarial();
        areaExibicao.append("💰 Folha Salarial Total: R$ " + String.format("%.2f", total) + "\n");
    }

    private void calcularMedia() {
        double media = empresa.calcularMediaSalarial();
        areaExibicao.append("📈 Média Salarial: R$ " + String.format("%.2f", media) + "\n");
    }

    private void mostrarErro(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }

    private void mostrarSucesso(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }
}
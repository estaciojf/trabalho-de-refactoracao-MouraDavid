package Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controllers.IniitController;

import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JButton;

public class InitView extends JFrame {

	
	private CadastroLivroView cadastroView;
	
	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InitView frame = new InitView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public InitView() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Meus Livros");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setBounds(6, 73, 438, 16);
		contentPane.add(lblNewLabel);
		
		JButton btnExibir = new JButton("Exibir");
		btnExibir.setBounds(39, 183, 117, 29);
		contentPane.add(btnExibir);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(264, 183, 117, 29);
		contentPane.add(btnCadastrar);
		
		
		
		IniitController handle = new IniitController(getCadastroView());

		

		
		handle.abrirExibirView();
		
		
		
		
		
		btnCadastrar.addActionListener(handle);
		btnExibir.addActionListener(handle);
	}

 /* - View InitView - Encapsulamento de metodos */
    public CadastroLivroView getCadastroView() {
        return cadastroView;
    }

    
    public void setCadastroView(CadastroLivroView cadastroView) {
        this.cadastroView = cadastroView;
    }

    
    public void setContentPane(JPanel contentPane) {
        this.contentPane = contentPane;
    }
	
}

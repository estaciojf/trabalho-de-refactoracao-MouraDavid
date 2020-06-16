package Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controllers.ExibirController;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.Image;
import java.sql.SQLException;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ExibirView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
     * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
                        @Override
			public void run() {
				try {
					ExibirView frame = new ExibirView();
					frame.setVisible(true);
				} catch (Exception e) {
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ExibirView() {
		setTitle("Exibir");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Buscar Livro");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		panel.add(btnBuscar);
		
		JButton btnRefresh = new JButton("");
		

		panel.add(btnRefresh);
		
		ImageIcon iconButton = new ImageIcon("/Users/leandrosimoes/Desktop/refresh_icon.png");
		Image imageIcon = iconButton.getImage();
		Image imageButton = imageIcon.getScaledInstance(12, 12, java.awt.Image.SCALE_SMOOTH);
		
		btnRefresh.setIcon(new ImageIcon(imageButton));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		table = new JTable();

				
		try {
			ExibirController handle = new ExibirController(table);
		} catch (SQLException e) {
		}

		
		
		scrollPane.setViewportView(table);
	}

}

package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import Models.Livro;

public class CadastroLivroController implements ActionListener {

	private JTextField fieldTitle;
	private JTextField fieldAuthor;
	private JComboBox comboGener;
	private JComboBox comboYear;
	private JCheckBox isRead;
	private List<Livro> listLivros;
	
	
	public CadastroLivroController(
			JTextField fieldTitle, 
			JTextField fieldAuthor,
			JComboBox comboGener,
			JComboBox comboYear,
			JCheckBox isRead) {
		
		this.fieldTitle = fieldTitle;
		this.fieldAuthor = fieldAuthor;
		this.isRead = isRead;
		
		listLivros = new ArrayList<>();
		
		this.populateComboYear(comboYear);
		this.populateComboGener(comboGener);
	}
	
	private void populateComboYear(JComboBox comboYear) {
            this.setComboYear(comboYear);
		
		int anoAtual = Calendar.getInstance().get(Calendar.YEAR); 
		
                for (int yearLoop = anoAtual ; yearLoop >= 1900 ; yearLoop --) {
			this.getComboYear().addItem(yearLoop);
		}
	}
	
        private void populateComboGener(JComboBox comboGender) {
		this.setComboGener(comboGener);
		String[] geners = new String[] { "Terror", "Ficção", "Drama", "Aventura", "Comédia", "Técnico" };
                for (String generLoop : geners) {
			this.getComboGener().addItem(generLoop);
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		System.out.println(event.getActionCommand());
		this.cadastrarLivro();
	}
	
        public void cadastrarLivro() {
		/*- CLASSE CadastroLivroController: - /*Campo author aceitar apenas letras*/
            Livro livro = new Livro(
                    this.getFieldTitle().getText(), 
				this.getFieldAuthor().getText().replaceAll("(A-Z | a-z)", ""),
                    this.getComboGener().getSelectedItem().toString(),
                    Integer.parseInt(this.getComboYear().getSelectedItem().toString()),
				this.getIsRead().isSelected()
				);
		
		getListLivros().add(livro);
		
		for (int i = 0 ; i < getListLivros().size() ; i ++ ) {
			System.out.println(getListLivros().get(i).toString());
		}
		
	}

    /*- CLASSE CadastroLivroController: - /*REFATORAÇÃO: ENCAPSULAMENTO DOS METRODOS E ATRIBUTOS AFIM DE SEPARAR MELHOR A CLASSE  */
    public JTextField getFieldTitle() {
        return fieldTitle;
    }

  
    public void setFieldTitle(JTextField fieldTitle) {
        this.fieldTitle = fieldTitle;
    }

  
    public JTextField getFieldAuthor() {
        return fieldAuthor;
    }

    public void setFieldAuthor(JTextField fieldAuthor) {
        this.fieldAuthor = fieldAuthor;
    }

   
    public JComboBox getComboGener() {
        return comboGener;
    }

    
    public void setComboGender(JComboBox comboGender) {
        this.comboGener = comboGender;
    }

   
    public JComboBox getComboYear() {
        return comboYear;
    }

    
    public void setComboYear(JComboBox comboYear) {
        this.comboYear = comboYear;
    }

  
    public JCheckBox getIsRead() {
        return isRead;
    }

   
    public void setIsRead(JCheckBox isRead) {
        this.isRead = isRead;
    }

  
    public List<Livro> getListLivros() {
        return listLivros;
    }

 
    public void setListLivros(List<Livro> listLivros) {
        this.listLivros = listLivros;
    }

    private void setComboGener(JComboBox comboGener) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
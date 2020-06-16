/*Criação de uma interface*/
package Listeners;

import java.sql.SQLException;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

/**
 *
 * @author linkd
 */
public interface NewInterface extends TableModelListener {

    void tableChanged(TableModelEvent e);

    void updateTable(TableModelEvent event) throws SQLException;
    
}

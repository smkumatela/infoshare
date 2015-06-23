package infoshare.client.sidebar.trees;

import com.vaadin.event.ItemClickEvent;
import com.vaadin.event.ItemClickEvent.ItemClickListener;
import com.vaadin.ui.Tree;
import infoshare.client.content.MainLayout;
import infoshare.client.content.password.PasswordMenu;

/**
 * Created by hashcode on 2015/06/23.
 */
public class PasswordTree extends Tree implements ItemClickListener{
    private final MainLayout main;
    private static final Object CHANGE_PASSWORD="Change PASSWORD";
    private static final String LANDING_TAB = "LANDING";


    public PasswordTree(MainLayout main) {
        this.main = main;
        addItem(CHANGE_PASSWORD);

        //Add Listerners
        addItemClickListener((ItemClickEvent.ItemClickListener) this);

    }

    @Override
    public void itemClick(ItemClickEvent itemClickEvent) {
        Object itemId = itemClickEvent.getItemId();
        if(itemId!=null){
            if(CHANGE_PASSWORD.equals(itemId)){
                main.content.setSecondComponent(new PasswordMenu(main, LANDING_TAB));
            }
        }

    }
}

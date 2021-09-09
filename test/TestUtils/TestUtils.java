package TestUtils;


import java.awt.*;
import javax.swing.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zhengkai Xie
 */
public class TestUtils {
    public static Component getChildNamed(Component parent, String name){
        if(name.equals(parent.getName())){
            return parent;
        }
        if(parent instanceof Container){
            Component [] children = (parent instanceof JMenu)? ((JMenu)parent).getMenuComponents():((Container)parent).getComponents();
            for(int i=0; i<children.length; ++i){
                Component child = getChildNamed(children[i], name);
                if(child != null){
                    return child;
                }
            }
        }
        return null;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_pokemon.inventario;

import java.awt.Color;
import java.awt.Graphics2D;
import proyecto_pokemon.items.Items;

/**
 *
 * @author jaam-_000
 */
public class Slots {

    public static final int tam = 1;
    private int x, y;
    private Stacks stacks;

    public Slots(int x, int y, Stacks stacks) {
        this.x = x;
        this.y = y;
        this.stacks = stacks;
    }

    public void tick() {

    }

    public void render(Graphics2D g) {
        g.setColor(Color.yellow);
        g.fillRect(x, y, tam, tam);
        g.setColor(Color.red);
        g.drawRect(x, y, tam, tam);

    }

    public Stacks getStacks() {
        return stacks;
    }

    public boolean additen(Items item, int cantidad) {
        if (stacks != null) {
            if (item.getNombre() == stacks.getItem().getNombre()) {
                this.stacks.setTamaño(this.stacks.getTamaño() + cantidad);
            } else {
                return false;
            }
        } else {
            this.stacks = new Stacks(tam, item);
            return true;
        }
    return false;
    }

}

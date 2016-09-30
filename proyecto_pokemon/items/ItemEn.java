/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_pokemon.items;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import proyecto_pokemon.jugador.Jugador;
import proyecto_pokemon.terreno.Terreno;
import static proyecto_pokemon.terreno.Terreno.size;

/**
 *
 * @author jaam-_000
 */
public class ItemEn {

    Items items;
    Terreno terreno;
    boolean visible;//para pokemons legendarios
    public Rectangle rect = new Rectangle();

    public ItemEn(Items items) {
        this.items = items;
    }

    public void tick() {
      //  rect.setBounds(x + Jugador.xInicial, y + Jugador.yInicial, size, size);
    }

    public void render(Graphics2D g) {
        g.drawImage(items.imagen, terreno.x + 10, terreno.y + 10, terreno.size - 20, terreno.size - 20, null);
    }

}

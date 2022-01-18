package me.duoly.bingo;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scoreboard.Team;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskGui implements CommandExecutor, Listener {
    private Main plugin;
    public TaskGui(Main plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    Inventory inv = Bukkit.createInventory(null, 54, "Zadania");
    Inventory TaskBlue = Bukkit.createInventory(null, 54, "Zadania");
    Inventory TaskRed = Bukkit.createInventory(null, 54, "Zadania");
    ItemStack bg = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
    ItemStack close = new ItemStack(Material.BARRIER);
    ItemStack accept = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
    ItemStack deny = new ItemStack(Material.RED_STAINED_GLASS_PANE);
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
        Player player = (Player) sender;
//        Generowanie planszy

        if(cmd.getName().equalsIgnoreCase("generate")){

//           Tworzenie Inventory


            for(int i=0;i<=53;i++){
                inv.setItem(i, bg);
            }

            ItemMeta denyMeta = deny.getItemMeta();
            denyMeta.setDisplayName(ChatColor.RED + "Losuj jeszcze raz");
            deny.setItemMeta(denyMeta);
            ItemMeta closeMeta = close.getItemMeta();
            closeMeta.setDisplayName("Zamknij");
            close.setItemMeta(closeMeta);
            ItemMeta acceptMeta = accept.getItemMeta();
            acceptMeta.setDisplayName(ChatColor.GREEN + "Akceptuje plansze");
            accept.setItemMeta(acceptMeta);

            inv.setItem(49, close);
            inv.setItem(47, accept);
            inv.setItem(51, deny);

//          Zmienne itemków

            ItemStack item = null;
            ItemMeta meta;
            List<String> lore = new ArrayList<String>();


//          Losowanie zadań i budowli

            int hightask = 20;
            int highbuild = 8;

            ArrayList<Integer> elementstask = new ArrayList<Integer>();
            ArrayList<Integer> elementsbuild = new ArrayList<Integer>();
            for(int i=1;i<=hightask;i++){
                elementstask.add(i);
            }
            for(int i=1;i<=highbuild;i++){
                elementsbuild.add(i);
            }

            Collections.shuffle(elementstask);
            Collections.shuffle(elementsbuild);
            Team team;

//          Wybieranie zadań i budowli
            for(int i=1; i<=15;i++){

                switch(elementstask.indexOf(i)+1) {
                    case 1:
                        item = new ItemStack(Material.STICK, 64);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "64 Patyki");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zbierz 64 Patyki");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 2:
                        item = new ItemStack(Material.RABBIT_STEW);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "1 Zupa z królika");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zrób jedną zupę z królika");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 3:
                        item = new ItemStack(Material.SLIME_BLOCK, 2);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "2 Bloki szlamu");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zrób dwa bloki szlamu");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 4:
                        item = new ItemStack(Material.GHAST_TEAR);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "1 Łza Ghasta");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zdobądź jedną łze Ghasta");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 5:
                        item = new ItemStack(Material.TNT,5);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "5 TNT");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zrób lub zdobądź pięć TNT");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 6:
                        item = new ItemStack(Material.BREAD,7);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "7 Bochenków chleba");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zrób lub zdobądź siedem bochenków chleba");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 7:
                        item = new ItemStack(Material.OAK_SAPLING,3);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "3 Różne sadzonki");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zdobądź trzy różne sadzonki");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 8:
                        item = new ItemStack(Material.GUNPOWDER,11);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "11 Sztuk proch strzelniczy");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zdobądż jedenaście sztuk prochu strzelniczego");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 9:
                        item = new ItemStack(Material.MAGMA_CREAM,2);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "2 Sztuki magmowego kremu");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zrób lub zdobądź dwie sztuki magmowego kremu");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 10:
                        item = new ItemStack(Material.WHITE_WOOL,6);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "6 Sztuk białej wełny");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zrób lub zdobądź sześć sztuk białej wełny");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 11:
                        item = new ItemStack(Material.HONEYCOMB,2);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "2 Plastry miodu");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zdobądź dwie sztuki plastrów miodu");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 12:
                        item = new ItemStack(Material.BLAZE_ROD);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "1 Płomienna różdżka");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zdobądź jedną sztukę płomiennej różdżki");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 13:
                        item = new ItemStack(Material.EGG,6);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "6 Jajek");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zdobądź sześć jajek");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 14:
                        item = new ItemStack(Material.NETHERRACK,37);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "37 Sztuk Netherracku");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zdobądź trzydzieści sześć sztuk netherracku");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 15:
                        item = new ItemStack(Material.OAK_SLAB,12);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "12 Dębowych płytek");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zrób dwanaście dębowych płyek");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 16:
                        item = new ItemStack(Material.BOOKSHELF,2);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "2 Biblioteczek");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zrób lub zdobądź dwie biblioteczki");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 17:
                        item = new ItemStack(Material.BOOK,10);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "10 Książek");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zrób lub zdobądź dziesięć książek");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 18:
                        item = new ItemStack(Material.CARROT,5);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "5 Marchewek");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zdobądź pięć marchewek");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 19:
                        item = new ItemStack(Material.WHEAT,12);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "12 Sztuk pszenicy");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zdobądź dwanaście sztuk pszenicy");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 20:
                        item = new ItemStack(Material.DIAMOND_PICKAXE);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "1 Diamentowy kilof");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zrób lub zdobądź jeden diamentowy kilof");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                };
//                Ustawianie itemków i inventory
                if(i<=5){
                    inv.setItem(10+i,item);
                }else if(i<=10){
                    inv.setItem(19+i-5,item);
                }else inv.setItem(23+i-5,item);

            }

//            Wybieranie budowli etc.
            for(int i=1;i<=5;i++){
                switch(elementsbuild.indexOf(i)+1){
                    case 1:
                        item = new ItemStack(Material.MAP);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "Gorące akwarium");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zbuduj sześcian 3x3 ze szkła z lawą w środku");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 2:
                        item = new ItemStack(Material.MAP);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "Żelaznego golema");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Stwórz żelaznego golema");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 3:
                        item = new ItemStack(Material.MAP);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "Bałwan");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Stwórz bałwana");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 4:
                        item = new ItemStack(Material.MAP);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "ZSE");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zbuduj napis ZSE");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 5:
                        item = new ItemStack(Material.MAP);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "Krzaczek");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zbuduj krzaczek");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 6:
                        item = new ItemStack(Material.MAP);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "Stolik");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zbuduj stolik (4 drewniane płytki naciskowe, 4 płotki)");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 7:
                        item = new ItemStack(Material.MAP);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "Mordercze kowadło");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zabij potwora z kowadła");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 8:
                        item = new ItemStack(Material.MAP);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "Ruchomy piasek");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zabij potwora zasypując go piaskiem");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                };
//                Ustawianie itemków i inventory
                inv.setItem(37+i,item);
            }
            player.openInventory(inv);
        }
        return false;
    }


//    EVENTY

//      Klikanie w inventory
    @EventHandler
    public void onClick(InventoryClickEvent event) {
//        Blokowanie wyciągania przedmiotów z inventory z zadaniami
        Player player = (Player) event.getWhoClicked();
        if(event.getClickedInventory() == inv || event.getClickedInventory() == TaskRed || event.getClickedInventory() == TaskBlue){
            event.setCancelled(true);
        }

        if(event.getSlot() == 47){
            if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("Akceptuje plansze")) {
                player.closeInventory();
                inv.setItem(47, bg);
                inv.setItem(51, bg);
                TaskRed = inv;
                TaskBlue = inv;
            }else event.setCancelled(true);
        }
        else if(event.getSlot() == 49){
            player.closeInventory();
        }
        else if(event.getSlot() == 51){
            if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("Losuj jeszcze raz")) {
                player.closeInventory();
                player.performCommand("generate");
            }else event.setCancelled(true);
        }
    }
}

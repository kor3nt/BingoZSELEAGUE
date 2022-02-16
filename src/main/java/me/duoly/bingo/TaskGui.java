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
    public static Inventory TaskBlue = null;
    public static Inventory TaskRed = null;
    ItemStack bg = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
    ItemStack close = new ItemStack(Material.BARRIER);
    ItemStack accept = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
    ItemStack deny = new ItemStack(Material.RED_STAINED_GLASS_PANE);
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
        Player player = (Player) sender;
//        Generowanie planszy
        if(Main.gameStart) {
            player.sendMessage(ChatColor.RED+"Nie możesz zmieniać planszy podczas gry!");
            return true;
        }
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

            int hightask = 82;
            int highbuild = 30;

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
                        item = new ItemStack(Material.IRON_INGOT,10);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "10 Sztabek żelaza");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zdobądź 10 sztabek żelaza");
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
                    case 21:
                        item = new ItemStack(Material.NETHER_WART,16);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "16 Netherowych brodawek");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zdobądź szesnaście netherowych brodawek");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 22:
                        item = new ItemStack(Material.COCOA_BEANS,5);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "5 Ziarn kakaowych");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zdobądź pięć ziarn kakaowych");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 23:
                        item = new ItemStack(Material.VINE,4);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "4 Liany");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zdobądź 4 liany");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 24:
                        item = new ItemStack(Material.GOLDEN_APPLE);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "1 Złote jabłko");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zdobądź jedno złote jabłko");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 25:
                        item = new ItemStack(Material.GLASS_BOTTLE);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "1 Butelke");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zrób jedną butelkę");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 26:
                        item = new ItemStack(Material.SALMON,5);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "5 Surowych łososi");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zdobądź pięć surowych łososi");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 27:
                        item = new ItemStack(Material.RAIL,16);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "16 torów");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zrób lub zdobądź szesnaście zwykłych torów");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 28:
                        item = new ItemStack(Material.STICKY_PISTON);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "1 Lepki tłok");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zrób lub zdobądź jeden lepki tłok");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 29:
                        item = new ItemStack(Material.LIME_STAINED_GLASS_PANE,16);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "16 Limonkowych barwionych szyb");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zrób lub zdobądź szesnaście jasnozielonych barwionych szyb");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 30:
                        item = new ItemStack(Material.NOTE_BLOCK);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "1 Blok dźwiękowy");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zrób lub zdobądź jeden blok dźwiękowy");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 31:
                        item = new ItemStack(Material.WHITE_CARPET,32);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "32 Biały dywan");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zrób lub zdobądź trzydzieści dwa białe dywany");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 32:
                        item = new ItemStack(Material.SUNFLOWER,16);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "16 Słoneczników");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zdobądź szesnaście słoneczników");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 33:
                        item = new ItemStack(Material.MILK_BUCKET);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "1 Wiadro mleka");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zdobądź jedno wiadro mleka");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 34:
                        item = new ItemStack(Material.SLIME_BALL,8);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "8 Kul szlamu");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zdobądź osiem kul szlamu");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 35:
                        item = new ItemStack(Material.ARROW,32);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "32 Strzały");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zrób lub zdobądź trzydzieści dwie strzały");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 36:
                        item = new ItemStack(Material.STONE,16);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "16 Kamienia");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zrób (przepal) lub zdobądź szesnaście kamienia");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 37:
                        item = new ItemStack(Material.FERN,5);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "5 Paprotek");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zdobądź pięć paprotek");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 38:
                        item = new ItemStack(Material.CACTUS,16);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "16 Kaktusów");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zdobądź szesnaście kaktusów");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 39:
                        item = new ItemStack(Material.BIRCH_SIGN,24);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "24 Brzozowych tabliczek");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zrób lub zdobądź dwadzieścia cztery brzozowe tabliczki");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 40:
                        item = new ItemStack(Material.ORANGE_BED);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "1 Pomarańczowe Łóżko");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zrób lub zdobądź jedno pomarańczowe łóżko");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 41:
                        item = new ItemStack(Material.ARMOR_STAND);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "1 Stojak na zbroję");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zrób lub zdobądź jeden stojak na zbroję");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 42:
                        item = new ItemStack(Material.LIME_BANNER,3);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "3 Jasnozielone sztandary");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zrób lub zdobądź trzy jasnozielone sztandary");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 43:
                        item = new ItemStack(Material.RED_MUSHROOM,5);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "5 Muchomorów");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zdobądź pięć muchomorów");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 44:
                        item = new ItemStack(Material.BLAZE_POWDER,8);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "8 Sztuk płomiennego proszku");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zrób lub zdobądź osiem sztuk płomiennych proszków");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 45:
                        item = new ItemStack(Material.RABBIT_FOOT,2);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "2 Królicze łapki");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zdobądź dwie królicze łapki");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 46:
                        item = new ItemStack(Material.SADDLE);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "1 Siodło");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zdobądź jedno siodło");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 47:
                        item = new ItemStack(Material.DIAMOND_AXE);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "1 Diamentowa siekiera");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zrób lub zdobądź jedną diamentową siekierę");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 48:
                        item = new ItemStack(Material.LEAD);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "1 Smycz");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zrób lub zdobądź jedną smycz");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 49:
                        item = new ItemStack(Material.CLOCK);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "1 Zegarek");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zrób lub zdobądź jeden zegarek");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 50:
                        item = new ItemStack(Material.NAME_TAG);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "1 Znacznik");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zdobądż jeden znacznik");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 51:
                        item = new ItemStack(Material.GOLDEN_HOE);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "1 Złota motyka");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zrób lub zdobądź jedną złotą motykę");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 52:
                        item = new ItemStack(Material.FLINT_AND_STEEL);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "1 Krzesiwo");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zrób lub zdobądź jedno krzesiwo");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 53:
                        item = new ItemStack(Material.FEATHER,10);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "10 piór");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zdobądź dziesięć piór");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 54:
                        item = new ItemStack(Material.GLOWSTONE_DUST,35);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "35 Jasnopyłu");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zdobądź trzydzieści pięć jasnopyłu");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 55:
                        item = new ItemStack(Material.SNOWBALL,23);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "23 śnieżki");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zdobądź dwadzieścia trzy śnieżki");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 56:
                        item = new ItemStack(Material.PURPLE_DYE,4);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "4 Sztuki fioletowego barwnika");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zdobądź cztery sztuki fioletowego barwnika");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 57:
                        item = new ItemStack(Material.GOLD_INGOT,15);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "15 Sztabek złota");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zdobądź piętnaście sztabek złota");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 58:
                        item = new ItemStack(Material.STRING,18);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "18 nici");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zdobądź osiemnaście nici");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 59:
                        item = new ItemStack(Material.BOWL,5);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "5 Misek");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zrób lub zdobądź pięć misek");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 60:
                        item = new ItemStack(Material.ENDER_PEARL,8);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "8 Pereł endu");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zdobądź szesnaście pereł endu");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 61:
                        item = new ItemStack(Material.LAVA_BUCKET);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "1 Wiadro Lawy");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zdobądź jedno wiadro lawy");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 62:
                        item = new ItemStack(Material.BONE_MEAL,20);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "20 Sztuk mączki kostnej");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zdobądź jedno wiadro lawy");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 63:
                        item = new ItemStack(Material.BRICK,12);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "12 Cegieł");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zrób lub zdobądź dwanaście cegieł");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 64:
                        item = new ItemStack(Material.BRICKS,5);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "5 Bloków cegieł");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zrób lub zdobądź pięć bloków cegiel");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 65:
                        item = new ItemStack(Material.END_STONE,12);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "12 Sztuki kamienia endu");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zrób lub zdobądź dwanaście sztuki kamienia endu");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 66:
                        item = new ItemStack(Material.STONE_PRESSURE_PLATE,4);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "4 Kamienne płytki naciskowe");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zrób lub zdobądź cztery kamienne płytki naciskowe");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 67:
                        item = new ItemStack(Material.STONE_BUTTON,20);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "20 Kamienne przyciski");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zrób lub zdobądź dwadzieścia kamienne przyciski");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 68:
                        item = new ItemStack(Material.LADDER,19);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "19 Drabinek");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zrób lub zdobądź dziewietnaście drabinek");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 69:
                        item = new ItemStack(Material.ANVIL,2);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "2 Kowadła");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zrób lub zdobądź dwa kowadła");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 70:
                        item = new ItemStack(Material.LAPIS_BLOCK,2);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "2 Bloki lazurytu");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zrób lub zdobądź dwa bloki lazurytu");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 71:
                        item = new ItemStack(Material.IRON_HORSE_ARMOR);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "1 Żelazna zbroja dla konia");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zdobądź jedną żelazną zbroję dla konia");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 72:
                        item = new ItemStack(Material.DIAMOND_CHESTPLATE);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "1 Diamentowy napierśnik");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zrób lub zdobądź jeden diamentowy napierśnik");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 73:
                        item = new ItemStack(Material.GOLD_NUGGET,64);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "64 Samorodki złota");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zrób lub zdobądź sześćdziesiąt cztery samorodki złota");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 74:
                        item = new ItemStack(Material.LEATHER,21);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "21 sztuk skóry");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zdobądź dwadzieścia jeden sztuk skóry");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 75:
                        item = new ItemStack(Material.INK_SAC,23);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "23 sztuk torbielu z atramentem");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zdobądź dwadzieścia trzy sztuki torbielu z atramentem");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 76:
                        item = new ItemStack(Material.SUGAR,13);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "13 Sztuk cukru");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zdoboądź trzynaście sztuk cukru");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 77:
                        item = new ItemStack(Material.PUFFERFISH,3);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "3 Rozdymek");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Złów trzy rozdymek");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 78:
                        item = new ItemStack(Material.QUARTZ_BLOCK,5);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "5 Bloków kwarcu");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Stwórz pięć bloków kwarcu");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 79:
                        item = new ItemStack(Material.ENDER_EYE,4);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "4 Oczu enderu");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zdobądź cztery oczy enderu");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 80:
                        item = new ItemStack(Material.FLOWER_POT);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "1 Doniczka");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zdobądź lub zrób jedną doniczkę");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 81:
                        item = new ItemStack(Material.SPRUCE_SAPLING,3);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "3 sadzonki świerku");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zdobądź trzy sadzonki świerku");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 82:
                        item = new ItemStack(Material.COOKED_PORKCHOP,5);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "5 Pieczonego schabu");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zrób lub zdobądź 5 sztuk pieczonego schabu");
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
                    case 9:
                        item = new ItemStack(Material.MAP);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "Zegarek");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Wybuduj zegarek z redstone (4 repeatery, 4 redstone)");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 10:
                        item = new ItemStack(Material.MAP);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "Creeper");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Wybuduj twarz creepera");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 11:
                        item = new ItemStack(Material.MAP);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "Skrzynka");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Wybuduj skrzynkę z 5x5x5 z drewna");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 12:
                        item = new ItemStack(Material.MAP);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "Palma");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Wybuduj palmę (z drewna Jungle wood, wysokość minimum 7 bloków)");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 13:
                        item = new ItemStack(Material.MAP);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "Kwiatki");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Wybuduj ogród z kwiatami");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 14:
                        item = new ItemStack(Material.MAP);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "Studnia");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Wybuduj studnię");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 15:
                        item = new ItemStack(Material.MAP);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "Przyjaciel");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Oswój psa");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 16:
                        item = new ItemStack(Material.MAP);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "Rollercoaster!");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Wybuduj mini kolejkę dla wagoników");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 17:
                        item = new ItemStack(Material.MAP);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "Pora na żeglugę!");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Wybuduj małą żaglówkę");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 18:
                        item = new ItemStack(Material.MAP);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "BRUM! BRUM!");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Wybuduj mały samochodzik");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 19:
                        item = new ItemStack(Material.MAP);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "Butla");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Wybuduj butlę z wodą");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 20:
                        item = new ItemStack(Material.MAP);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "Nether");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zbuduj portal do netheru");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 21:
                        item = new ItemStack(Material.MAP);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "Rybak");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zbuduj staw");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 22:
                        item = new ItemStack(Material.MAP);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "Santa Monica Pier");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zbuduj molo/port");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 23:
                        item = new ItemStack(Material.MAP);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "Fontanna");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Wybuduj własną fontanne");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 24:
                        item = new ItemStack(Material.MAP);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "Światło!");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zbuduj uliczną latarnie");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 25:
                        item = new ItemStack(Material.MAP);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "Piramida");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zbuduj piramidę o wysokości minimum 5 bloków");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 26:
                        item = new ItemStack(Material.MAP);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "Most");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zbuduj most łączący dwa brzegi rzeki");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 27:
                        item = new ItemStack(Material.MAP);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "Obozowisko");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zbuduj obozowisko (2 namioty, jedno ognisko)");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 28:
                        item = new ItemStack(Material.MAP);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "Enchant");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zbuduj enchant z możliwym enchantem na 30 level");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 29:
                        item = new ItemStack(Material.MAP);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "Hodowla");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zbuduj hodowle (2 zwierzęta zamknięte w zagrodzie z płotków)");
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        break;
                    case 30:
                        item = new ItemStack(Material.MAP);
                        meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "Podwodny dom");
                        meta.removeItemFlags();
                        lore.clear();
                        lore.add(ChatColor.GRAY + "Zbuduj  dom pod wodą");
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
            if(event.getWhoClicked().isOp()) {
                player.closeInventory();
                TaskBlue = Bukkit.createInventory(null, 54, "Zadania Blue");
                TaskRed = Bukkit.createInventory(null, 54, "Zadania Red");
                inv.setItem(47, bg);
                inv.setItem(51, bg);
                ItemStack[] content = inv.getContents();
                TaskRed.setContents(content);
                TaskBlue.setContents(content);
                event.getWhoClicked().sendMessage(ChatColor.GREEN + "Utworzyłeś plansze!");
            }else event.setCancelled(true);
        }
        else if(event.getSlot() == 49){
            player.closeInventory();
        }
        else if(event.getSlot() == 51){
            if(event.getWhoClicked().isOp()) {
                player.closeInventory();
                player.performCommand("generate");
            }else event.setCancelled(true);
        }
    }
}

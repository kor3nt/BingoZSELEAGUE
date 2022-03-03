package me.duoly.bingo;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.*;

public class CreateScoreboard {


    private int text=0;
    Stream stream = new Stream();
    public void createScorebord(Player player){
        stream.Scoreboard();
        ScoreboardManager manager = Bukkit.getScoreboardManager();
        Scoreboard board = manager.getNewScoreboard();
        Objective obj = board.registerNewObjective("Game", "dummy", ChatColor.GOLD + "ZSE League");
        obj.setDisplaySlot(DisplaySlot.SIDEBAR);

        Score s1 = obj.getScore(ChatColor.RED + "Team: " + Main.tagNameA+ "   " + TasksChecking.ScoreTeamA);

        s1.setScore(4);
        Score s2 = obj.getScore(" ");
        s2.setScore(3);
        Score s3 = obj.getScore(ChatColor.BLUE + "Team: " + Main.tagNameB + "   " + TasksChecking.ScoreTeamB);
        s3.setScore(2);
        Score s4 = obj.getScore(" ");
        s4.setScore(1);
        Score s5 = obj.getScore(ChatColor.YELLOW + "esportwzse.pl/zseleague");
        s5.setScore(0);
        player.setScoreboard(board);
    }

        BossBar bar;
        double progress = 1.0;
        int timer = 100; //20 to jedna sekunda
        int countID;
        private Main plugin;
        double time=progress/timer;
        public CreateScoreboard(Main plugin) {
        this.plugin = plugin;

        }

        public void addPlayer(Player p){
            bar.addPlayer(p);
        }
        public BossBar getBar(){
            return bar;
        }
        public void createBar(){
            bar = Bukkit.createBossBar(ChatColor.GREEN+"Witaj na serwerze", BarColor.GREEN, BarStyle.SOLID);
            bar.setVisible(true);
        }

        public void cast() {
            countID=plugin.getServer().getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
                public void run(){
                    if(!Main.gameStart){
                        if (progress > 0) {
                            bar.setProgress(progress);
                            progress=progress-time;
                        }else {
                            text++;
                            switch (text){
                                case 1:
                                    bar.setTitle(ChatColor.BLUE+"Jeśli jesteś kapitanem załóż swoją drużyne(/party).");
                                    bar.setColor(BarColor.BLUE);
                                    progress=1.0;
                                    run();
                                    break;
                                case 2:
                                    bar.setTitle(ChatColor.LIGHT_PURPLE+"Nie znasz komend? Zajrzyj tu /pomoc!");
                                    bar.setColor(BarColor.PINK);
                                    progress=1.0;
                                    run();
                                    break;
                                case 3:
                                    bar.setTitle(ChatColor.RED+"Bądź nabierząco z rozgrywkami wejdź na stronę www.esportwzse.pl/zseleague!");
                                    bar.setColor(BarColor.RED);
                                    progress=1.0;
                                    run();
                                    break;
                                case 4:
                                    bar.setTitle(ChatColor.GOLD+"Nasz oficjalny kanał na YouTube to ZSE League, znajdziesz tam transmisje z rozgrywek!");
                                    bar.setColor(BarColor.YELLOW);
                                    progress=1.0;
                                    run();
                                    break;
                                case 5:
                                    bar.setTitle(ChatColor.GREEN+"Witaj na serwerze");
                                    bar.setColor(BarColor.GREEN);
                                    text=0;
                                    progress=1.0;
                                    run();
                                    break;
                            }
                        }
                    }else bar.setVisible(false);
                }
            }, 0L, 1L);

        }
}


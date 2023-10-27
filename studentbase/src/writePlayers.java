public static void writePlayers(){
        try{
        FileWriter writer=new FileWriter("players.txt")
        for(Player p:players){
        writer.write(p.getName()+","+p.getAmount()+"\n");
        }
        writer.close();

        }catch(Exception e){System.out.println(e);
        }
        }
        }

public class Gryffindor extends Houses implements Magicable{
    public Gryffindor(){
        super("Gryffindor", "RED");
    }
    @Override
    public void attackSpell(Player player, Player target, Spell spell) {
       if (spell instanceof Incendio) {
            int totalDamage = spell.getDamage() + player.getAttackDamage();
            target.setHp(target.getHp() - totalDamage);
            player.setMana(player.getMana() - 4);
        } else if (spell instanceof Expelliarmus) {
            int totalDamage = spell.getDamage() + player.getAttackDamage();
            target.setHp(target.getHp() - totalDamage);
            player.setMana(player.getMana() - 3);
        }
        System.out.println("["+player.getName()+"]: use spell ("+spell.getName()+")!"); 
    }
    @Override
    public void defense(Player player, Player damager){
        System.out.println("["+player.getName()+"]: Episkey !");
        player.setHp(player.getHp() + 3);
        player.setMana(player.getMana() + 4);
    }
}

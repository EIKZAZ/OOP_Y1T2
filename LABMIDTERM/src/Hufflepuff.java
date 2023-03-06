
public class Hufflepuff extends Houses implements Magicable{
    public Hufflepuff() {
        super("Hufflepuff", "YELLOW");
    }
    @Override
    public void attackSpell(Player player, Player target, Spell spell){
        if (spell instanceof Incendio) {
            int totalDamage = spell.getDamage() + player.getAttackDamage();
            target.setHp(target.getHp() - totalDamage);
            player.setMana(player.getMana() - 3);
        } else if (spell instanceof Expelliarmus) {
            int totalDamage = spell.getDamage() + player.getAttackDamage();
            target.setHp(target.getHp() - totalDamage);
            player.setMana(player.getMana() - 4);
        }
        System.out.println("["+player.getName()+"]: use spell ("+spell.getName()+")!");
    }
    @Override
    public void defense(Player player, Player damager){
        System.out.println("["+player.getName()+"]: Protego !");
        player.setHp(player.getHp() + 4);
        player.setMana(player.getMana()+ 3);
    }
}

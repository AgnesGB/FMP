//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Race Yvaris = new Race();
        LivingBeingEssence teste = new Mortal(true, "Mortal", "Haru", "HD", 56, "W",  "Menuli");

        System.out.println(teste.LivingEssenceCode());
        System.out.println(teste.race.getRace());
        System.out.println(teste.race.getRaceEffects());
        System.out.println(teste.essenceType.getEssenceTypetoString());
        teste.attributes.setAtributes(0,2,2,2,2,2);
        System.out.println(teste.attributes.getAtributes());
        System.out.println(teste.attributes.sumAttributes());
        teste.ascend("Servant", 5,2,2,2,2,2);
        System.out.println(teste.attributes.getAtributes());
        System.out.println(teste.essenceType.getEssenceTypetoString());
        System.out.println(teste.attributes.sumAttributes());

    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreateEssence teste = new CreateEssence(true, "Haru", "HD", 56, "W",  "Menuli",false,false,false);

        System.out.println(teste.LivingEssenceCode());
        System.out.println(teste.race.getRace());
        System.out.println(teste.race.getRaceEffects());
        System.out.println(teste.essenceType.getEssenceTypetoString());
        teste.verifyAttributes (0,2,2,2,2,2);
        System.out.println(teste.attributes.getAtributes());
        System.out.println(teste.attributes.sumAttributes());
        teste.ascend("Servant", 5,2,2,2,2,2);
        System.out.println(teste.attributes.getAtributes());
        System.out.println(teste.essenceType.getEssenceTypetoString());
        System.out.println(teste.attributes.sumAttributes());
        teste.ascend("Demi God", 5,5,4,2,2,2);
        System.out.println(teste.attributes.getAtributes());
        System.out.println(teste.essenceType.getEssenceTypetoString());
        System.out.println(teste.attributes.sumAttributes());

    }
}
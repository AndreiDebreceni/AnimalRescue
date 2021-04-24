package AnimalRescue;

import AnimalRescue.objects.AnimalObj;

public class AppMain {
    public static void main(String[] args) {
         AnimalObj dog = new Dog();
         dog.setName("Lola");
         dog.setAge(3);
        System.out.println(" Numele cainelui este "+dog.getName());

         Veterinarian vet = new Veterinarian();
         vet.setName("dr.Bean");
        System.out.println("Numele veterinarului este "+vet.getName());

         Meat food = new Meat();
         food.setType("Meat");
         food.setAddBonus(10);
         food.setQuantity(3);
         food.setPrice(5);
        System.out.println("Catelul meu a mancat "+food.getType());

        Girl anna = new Girl();
        anna.setName("Anna");
        System.out.println("Pe fetita o cheama " +anna.getName());

        Duck duffy = new Duck();
        duffy.speack();
        duffy.setName("Duffy");
        System.out.println("Pe ratusca o cheama " +duffy.getName());

        System.out.println(anna.getName()+ " s-a dus la veterinarul "+vet.getName()+" deoarece cainele ei "+dog.getName()+" in varsta de "+dog.getAge()+
                " ani, a muscat-o ratusca "+duffy.getName()+" pentru ca a vrut sa-i manance "+food.getType()+" ! ");
        duffy.speack();
        anna.speack();
        vet.speack();
        dog.speack();
        Parrot Lulu = new Parrot();
        Lulu.speack();


















    }
}

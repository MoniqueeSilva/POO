package guerreiros;

import java.util.Random;

public class Guerreiro {
   private int codigo;
   private String nome;
   private int energia;
   private Random random;

   public Guerreiro(int var1, String var2) {
      this.codigo = var1;
      this.nome = var2;
      this.energia = 5;
      this.random = new Random();
   }

   public int getEnergia() {
      return this.energia;
   }

   public void incremento() {
      if (this.energia < 5) {
         ++this.energia;
         System.out.println(this.nome + " recuperou 1 ponto de energia! Energia: " + this.energia);
      } else {
         System.out.println(this.nome + " já está com energia máxima (5)!");
      }

   }

   public void decremento() {
      if (this.energia > 0) {
         --this.energia;
         System.out.println(this.nome + " perdeu 1 ponto de energia! Energia: " + this.energia);
         if (this.energia == 0) {
            System.out.println(this.nome + " está sem energia!");
         }
      }

   }

   public void alimentarSe() {
      System.out.println(this.nome + " está se alimentando...");
      this.incremento();
   }

   private int atacar() {
      return this.random.nextInt(2);
   }

   public void lutar(Guerreiro var1) {
      System.out.println("\n== COMBATE INICIADO ==");
      System.out.println(this.nome + " vs " + var1.nome);

      while(this.energia > 0 && var1.energia > 0) {
         int var2 = this.atacar();
         if (var2 == 1) {
            System.out.println(this.nome + " acertou o ataque!");
            var1.decremento();
         } else {
            System.out.println(this.nome + " errou o ataque!");
         }

         if (var1.energia == 0) {
            break;
         }

         var2 = var1.atacar();
         if (var2 == 1) {
            System.out.println(var1.nome + " acertou o ataque!");
            this.decremento();
         } else {
            System.out.println(var1.nome + " errou o ataque!");
         }
      }

      if (this.energia > 0) {
         System.out.println("\n== " + this.nome.toUpperCase() + " VENCEU A LUTA! ==");
      } else {
         System.out.println("\n== " + var1.nome.toUpperCase() + " VENCEU A LUTA! ==");
      }

   }

   public void lutarRecursivo(Guerreiro var1) {
      if (this.energia != 0 && var1.energia != 0) {
         int var2 = this.atacar();
         if (var2 == 1) {
            System.out.println(this.nome + " acertou o ataque!");
            var1.decremento();
         } else {
            System.out.println(this.nome + " errou o ataque!");
         }

         if (var1.energia > 0) {
            var2 = var1.atacar();
            if (var2 == 1) {
               System.out.println(var1.nome + " acertou o ataque!");
               this.decremento();
            } else {
               System.out.println(var1.nome + " errou o ataque!");
            }
         }

         this.lutarRecursivo(var1);
      } else {
         if (this.energia > 0) {
            System.out.println("\n== " + this.nome.toUpperCase() + " VENCEU A LUTA! ==");
         } else {
            System.out.println("\n== " + var1.nome.toUpperCase() + " VENCEU A LUTA! ==");
         }

      }
   }

   public String toString() {
      return "Guerreiro {Código: " + this.codigo + ", Nome: '" + this.nome + "', Energia: " + this.energia + "/5}";
   }
}

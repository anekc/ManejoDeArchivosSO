package crear_arch;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/**
 * @author Alejandro Arteaga
 */
public class Crear_arch {    
    public static void main(String[] args) throws IOException {
        Scanner consola = new Scanner(System.in); 
       // Scanner consola2 = new Scanner(System.in);
       
        boolean salir = false;
         
        System.out.println("Escribe la ruta donde deseas trabajar: ");
        String select_ruta = consola.nextLine();
        File find_ruta = new File (select_ruta);
       
        while(!salir){
             
             
            
             System.out.println("¿Que deseas realizar?: \n" + "1. Crear Carperta\n" +      
                "2. Borrar Carperta(Solo se borraran carpetas vacias)\n" + "3. Renombrar Carpeta\n" + "4. Mover Carpeta\n" + 
                "5. Mostrar carpetas/archivos existentes\n" + "6.Crear archivo\n" + "7.Borrar archivo\n" 
                + "8.Renombrar archivo\n" + "9.Mover archivo\n" + "10. Salir\n");
        int opt = Integer.parseInt(consola.nextLine());
            switch (opt){
              
                case 1: //crear carpeta
                    System.out.println("Escribe el nombre de la nueva carpeta: ");
                    String arch_new = consola.nextLine();
                    File new_ruta = new File (select_ruta + File.separator + arch_new);
                    new_ruta.mkdir();
                    System.out.println("\nLa carpeta se ha creado correctamente\n");
                    System.out.println("\n");
                    break;
                    
                case 2: //eliminar un carpeta 
                    System.out.println("Escribe el nombre de la carpeta a eliminar: ");
                    String carp_del = consola.nextLine();
                    File new_ruta2 = new File (select_ruta + File.separator + carp_del);
                    boolean aprov = new_ruta2.delete();
                    if(aprov){
                        System.out.println("\nLa carpeta se borro correctamente\n");
                    }else{
                        System.out.println("\nLa carpeta no se borro correctamente\n");
                    }
                    System.out.println("\n");
                    break;
                    
                case 3: //reenombrar carpeta
                    System.out.println("Escriba el nombre de la carpeta a renombrar: ");
                    String carp = consola.nextLine();
                    File new_ruta3 = new File (select_ruta + File.separator + carp);
                    System.out.println("Escriba el nuevo nombre de la carpeta: ");
                    String carp_ren = consola.nextLine();
                    boolean aprov1 = new_ruta3.renameTo( new File (select_ruta + File.separator + carp_ren ));
                    if (aprov1){
                         System.out.println("\nCarpeta fue renombrada correctamente\n");
                    }else{
                         System.out.println("\nCarpeta no fue renombrada correctamente\n");
                    }
                    System.out.println("\n");
                    break;
                    
                case 4: //mover carpeta
                    System.out.println("Escriba el nombre de la carpeta que desea mover: ");
                    String carp1 = consola.nextLine();
                    File new_ruta4 = new File (select_ruta + File.separator + carp1);
                    System.out.println("Escriba el nombre del lugar a donde desea mover la carpeta: ");
                    String carp_mov = consola.nextLine();
                    File new_ruta5 = new File (select_ruta + File.separator + carp_mov);
                    boolean aprov3 = new_ruta4.renameTo(new File (new_ruta5, new_ruta4.getName()));
                    
                    if(aprov3){
                        System.out.println("\nSe movio corectamnete la carpeta\n");
                    }else{
                        System.out.println("\nNo se movio correctamente la carpeta\n");
                    }
                    System.out.println("\n");
                    break;    
                    
                case 5: //mostrar archivos y/o carpetas
                    System.out.println("Escriba direccion/carpeta que desea ver su contenido");
                    String ver = consola.nextLine();
                    File mostrar = new File(select_ruta + File.separator + ver); 
                    String [] ca_exist = mostrar.list();
                    System.out.println("Archivos existentes: ");
                    for (int i=0; i<ca_exist.length ;i++){
                        System.out.println(ca_exist[i]);
                    }
                    System.out.println("\n");
                    break;
                    
                case 6: //crear archivo
                    System.out.println("Escriba el nombre de la carpeta donde desea crear el archivo: ");
                    String carp2 = consola.nextLine();
                    File new_ruta6 = new File(select_ruta + File.separator + carp2);
                    System.out.println("Escriba el nombre del archivo a crear: ");
                    String arch = consola.nextLine();
                    File new_arch = new File (new_ruta6, arch + ".txt" );
                    boolean aprov4 = new_arch.createNewFile();
                    if (aprov4){
                        System.out.println("\nSe creo correctamente el archivo\n");
                    }else{
                        System.out.println("\nNo se creo correctamente el archivo\n");
                    }
                    System.out.println("\n");
                    break;  
                     
                    
                case 7: //borrar archivo
                    System.out.println("Escriba el nombre de la carpeta donde se encuentra el archivo a borrar: ");
                    String carp3 = consola.nextLine();
                    File new_ruta7 = new File(select_ruta + File.separator + carp3);
                    System.out.println("Escriba el nombre del archivo a borrar: ");
                    String arch1 = consola.nextLine();
                    File new_arch1 = new File (new_ruta7, arch1 + ".txt" );
                    boolean aprov5 = new_arch1.delete();
                    if (aprov5){
                        System.out.println("\nSe borro correctamente el archivo\n");
                    }else{
                        System.out.println("\nNo se borro correctamente el archivo\n");
                    }
                    System.out.println("\n");
                    break;
                    
                case 8: //renombrar archivo 
                    System.out.println("Escriba el nombre de la carpeta donde se encuentra el archivo a renombrar: ");
                    String carp4 = consola.nextLine();
                    File new_ruta8 = new File(select_ruta + File.separator + carp4);
                    System.out.println("Escriba el nombre del archivo a renombrar: ");
                    String arch2 = consola.nextLine();
                    File new_arch2 = new File (new_ruta8, arch2 + ".txt" );
                    System.out.println("Escriba el nuevo nombre: ");
                    String arch3 = consola.nextLine();
                    boolean aprov6 = new_arch2.renameTo(new File (new_ruta8, arch3 + ".txt" ));
                    if (aprov6){
                        System.out.println("\nSe renombro correctamente el archivo\n");
                    }else{
                        System.out.println("\nNo se renombro correctamente el archivo\n");
                    }
                    System.out.println("\n");
                    break;
                    
                case 9: //mover archivo 
                    System.out.println("Escriba el nombre/direccion de la carpeta donde se encuentra el archivo a mover: ");
                    String carp5 = consola.nextLine();
                    File new_ruta9 = new File(select_ruta + File.separator + carp5);
                    System.out.println("Escriba el nombre del archivo a mover: ");
                    String arch4 = consola.nextLine();
                    File new_arch3 = new File (new_ruta9, arch4 + ".txt");
                    System.out.println("Escriba el nombre del lugar a donde desea mover el archivo: ");
                    String arch_mov = consola.nextLine();
                    File new_ruta10 = new File (select_ruta + File.separator + arch_mov);
                    boolean aprov7 = new_arch3.renameTo(new File (new_ruta10, new_arch3.getName()));
                    
                    if(aprov7){
                        System.out.println("\nSe movio corectamnete el archivo\n");
                    }else{
                        System.out.println("\nNo se movio correctamente el archivo\n");
                    }
                    System.out.println("\n");
                    break; 
                    
                case 10:
                    salir = true;
                    default:
                        
                    break;    
            
            }
        
        }     
        
    }
    
}
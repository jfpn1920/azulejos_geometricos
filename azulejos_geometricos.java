import java.util.Scanner;
public class azulejos_geometricos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] codigos = new String[10];
        String[] nombres = new String[10];
        String[] formas = new String[10];
        String[] materiales = new String[10];
        double[] largos = new double[10];
        double[] anchos = new double[10];
        String[] colores = new String[10];
        String[] patrones = new String[10];
        int[] cantidades = new int[10];
        double[] precios = new double[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //---------------------------------------//
        //--|menu_principal_de_azulejos_geometricos|--//
        //-----------------------------------//
        do {
            System.out.println("menu principal de azulejos geometricos");
            System.out.println("1) Registrar azulejo");
            System.out.println("2) Editar azulejo");
            System.out.println("3) Listar azulejos");
            System.out.println("4) Buscar azulejo");
            System.out.println("5) Eliminar azulejo");
            System.out.println("6) Mostrar resumen");
            System.out.println("7) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //-----------------------//
                //--|registrar_azulejo|--//
                //-----------------------//
                case 1:
                    if (total >= codigos.length) {
                        System.out.println("No hay espacio para registrar mas azulejos.");
                        break;
                    }
                    System.out.println("registro de azulejo");
                    System.out.println("ID: " + (total + 1));
                    System.out.print("codigo: ");
                    codigos[total] = entrada.nextLine();
                    System.out.print("nombre del diseño: ");
                    nombres[total] = entrada.nextLine();
                    System.out.print("forma geometrica: ");
                    formas[total] = entrada.nextLine();
                    System.out.print("material: ");
                    materiales[total] = entrada.nextLine();
                    System.out.print("largo en centimetros: ");
                    largos[total] = entrada.nextDouble();
                    System.out.print("ancho en centimetros: ");
                    anchos[total] = entrada.nextDouble();
                    entrada.nextLine();
                    System.out.print("color: ");
                    colores[total] = entrada.nextLine();
                    System.out.print("patron: ");
                    patrones[total] = entrada.nextLine();
                    System.out.print("cantidad de piezas: ");
                    cantidades[total] = entrada.nextInt();
                    System.out.print("precio por pieza: ");
                    precios[total] = entrada.nextDouble();
                    entrada.nextLine();
                    System.out.print("estado: ");
                    estados[total] = entrada.nextLine();
                    total++;
                    System.out.println("Azulejo registrado correctamente.");
                    break;
                //--------------------//
                //--|editar_azulejo|--//
                //--------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen azulejos registrados.");
                        break;
                    }
                    System.out.println("datos de los azulejos");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Codigo: " + codigos[i] + " | Nombre: " + nombres[i] + " | Forma: " + formas[i] + " | Material: " + materiales[i] + " | Largo: " + largos[i] + " cm | Ancho: " + anchos[i] + " cm | Color: " + colores[i] + " | Patron: " + patrones[i] + " | Cantidad: " + cantidades[i] + " | Precio: " + precios[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del azulejo a editar: ");
                    int idEditar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEditar >= 1 && idEditar <= total) {
                        int posicion = idEditar - 1;
                        System.out.println("editar azulejo");
                        System.out.print("nuevo codigo: ");
                        codigos[posicion] = entrada.nextLine();
                        System.out.print("nuevo nombre del diseño: ");
                        nombres[posicion] = entrada.nextLine();
                        System.out.print("nueva forma geometrica: ");
                        formas[posicion] = entrada.nextLine();
                        System.out.print("nuevo material: ");
                        materiales[posicion] = entrada.nextLine();
                        System.out.print("nuevo largo en centimetros: ");
                        largos[posicion] = entrada.nextDouble();
                        System.out.print("nuevo ancho en centimetros: ");
                        anchos[posicion] = entrada.nextDouble();
                        entrada.nextLine();
                        System.out.print("nuevo color: ");
                        colores[posicion] = entrada.nextLine();
                        System.out.print("nuevo patron: ");
                        patrones[posicion] = entrada.nextLine();
                        System.out.print("nueva cantidad de piezas: ");
                        cantidades[posicion] = entrada.nextInt();
                        System.out.print("nuevo precio por pieza: ");
                        precios[posicion] = entrada.nextDouble();
                        entrada.nextLine();
                        System.out.print("nuevo estado: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Azulejo actualizado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|listar_azulejos|--//
                //---------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen azulejos registrados.");
                    } else {
                        System.out.println("lista de azulejos");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Codigo: " + codigos[i] + " | Nombre: " + nombres[i] + " | Forma: " + formas[i] + " | Material: " + materiales[i] + " | Largo: " + largos[i] + " cm | Ancho: " + anchos[i] + " cm | Color: " + colores[i] + " | Patron: " + patrones[i] + " | Cantidad: " + cantidades[i] + " | Precio: " + precios[i] + " | Estado: " + estados[i]);
                        }
                    }
                    break;
                //--------------------//
                //--|buscar_azulejo|--//
                //--------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen azulejos registrados.");
                        break;
                    }
                    System.out.println("busqueda de azulejo");
                    System.out.print("Ingrese el ID del azulejo a buscar: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("azulejo encontrado");
                        System.out.println("ID: " + idBusqueda + " | Codigo: " + codigos[posicion] + " | Nombre: " + nombres[posicion] + " | Forma: " + formas[posicion] + " | Material: " + materiales[posicion] + " | Largo: " + largos[posicion] + " cm | Ancho: " + anchos[posicion] + " cm | Color: " + colores[posicion] + " | Patron: " + patrones[posicion] + " | Cantidad: " + cantidades[posicion] + " | Precio: " + precios[posicion] + " | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //----------------------//
                //--|eliminar_azulejo|--//
                //----------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen azulejos registrados.");
                        break;
                    }
                    System.out.println("datos de los azulejos");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Codigo: " + codigos[i] + " | Nombre: " + nombres[i] + " | Forma: " + formas[i] + " | Material: " + materiales[i] + " | Largo: " + largos[i] + " cm | Ancho: " + anchos[i] + " cm | Color: " + colores[i] + " | Patron: " + patrones[i] + " | Cantidad: " + cantidades[i] + " | Precio: " + precios[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del azulejo a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            codigos[i] = codigos[i + 1];
                            nombres[i] = nombres[i + 1];
                            formas[i] = formas[i + 1];
                            materiales[i] = materiales[i + 1];
                            largos[i] = largos[i + 1];
                            anchos[i] = anchos[i + 1];
                            colores[i] = colores[i + 1];
                            patrones[i] = patrones[i + 1];
                            cantidades[i] = cantidades[i + 1];
                            precios[i] = precios[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Azulejo eliminado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|mostrar_resumen|--//
                //---------------------//
                case 6:
                    if (total == 0) {
                        System.out.println("No existen azulejos registrados.");
                        break;
                    }
                    int totalPiezas = 0;
                    double sumaPrecios = 0;
                    for (int i = 0; i < total; i++) {
                        totalPiezas += cantidades[i];
                        sumaPrecios += precios[i];
                    }
                    double precioPromedio = sumaPrecios / total;
                    String formaMayor = formas[0];
                    int cantidadFormaMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadForma = 0;
                        for (int j = 0; j < total; j++) {
                            if (formas[i].equalsIgnoreCase(formas[j])) {
                                cantidadForma++;
                            }
                        }
                        if (cantidadForma > cantidadFormaMayor) {
                            cantidadFormaMayor = cantidadForma;
                            formaMayor = formas[i];
                        }
                    }
                    String materialMayor = materiales[0];
                    int cantidadMaterialMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadMaterial = 0;
                        for (int j = 0; j < total; j++) {
                            if (materiales[i].equalsIgnoreCase(materiales[j])) {
                                cantidadMaterial++;
                            }
                        }
                        if (cantidadMaterial > cantidadMaterialMayor) {
                            cantidadMaterialMayor = cantidadMaterial;
                            materialMayor = materiales[i];
                        }
                    }
                    String colorMayor = colores[0];
                    int cantidadColorMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadColor = 0;
                        for (int j = 0; j < total; j++) {
                            if (colores[i].equalsIgnoreCase(colores[j])) {
                                cantidadColor++;
                            }
                        }
                        if (cantidadColor > cantidadColorMayor) {
                            cantidadColorMayor = cantidadColor;
                            colorMayor = colores[i];
                        }
                    }
                    String patronMayor = patrones[0];
                    int cantidadPatronMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadPatron = 0;
                        for (int j = 0; j < total; j++) {
                            if (patrones[i].equalsIgnoreCase(patrones[j])) {
                                cantidadPatron++;
                            }
                        }
                        if (cantidadPatron > cantidadPatronMayor) {
                            cantidadPatronMayor = cantidadPatron;
                            patronMayor = patrones[i];
                        }
                    }
                    int posicionMayorCantidad = 0;
                    for (int i = 1; i < total; i++) {
                        if (cantidades[i] > cantidades[posicionMayorCantidad]) {
                            posicionMayorCantidad = i;
                        }
                    }
                    int posicionMayorPrecio = 0;
                    for (int i = 1; i < total; i++) {
                        if (precios[i] > precios[posicionMayorPrecio]) {
                            posicionMayorPrecio = i;
                        }
                    }
                    int disponibles = 0;
                    int agotados = 0;
                    int descontinuados = 0;
                    for (int i = 0; i < total; i++) {
                        if (estados[i].equalsIgnoreCase("Disponible")) {
                            disponibles++;
                        } else if (estados[i].equalsIgnoreCase("Agotado")) {
                            agotados++;
                        } else if (estados[i].equalsIgnoreCase("Descontinuado")) {
                            descontinuados++;
                        }
                    }
                    System.out.println("resumen de azulejos geometricos");
                    System.out.println("Modelos registrados: " + total);
                    System.out.println("Total de piezas disponibles: " + totalPiezas);
                    System.out.println("Forma mas utilizada: " + formaMayor);
                    System.out.println("Material mas utilizado: " + materialMayor);
                    System.out.println("Color mas utilizado: " + colorMayor);
                    System.out.println("Patron mas utilizado: " + patronMayor);
                    System.out.println("Modelo con mayor cantidad: " + codigos[posicionMayorCantidad]);
                    System.out.println("Mayor cantidad: " + cantidades[posicionMayorCantidad] + " piezas");
                    System.out.println("Modelo con mayor precio: " + codigos[posicionMayorPrecio]);
                    System.out.println("Mayor precio: " + precios[posicionMayorPrecio]);
                    System.out.println("Precio promedio: " + precioPromedio);
                    System.out.println("Modelos disponibles: " + disponibles);
                    System.out.println("Modelos agotados: " + agotados);
                    System.out.println("Modelos descontinuados: " + descontinuados);
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 7:
                    System.out.println("Gracias por utilizar Azulejos Geometricos.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 7);
        entrada.close();
    }
}
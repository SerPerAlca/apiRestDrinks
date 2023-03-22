package consumoapi.example;


import POJO.Drink;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws MalformedURLException {
        String url = "https://www.thecocktaildb.com/api/json/v1/1/search.php?s=";
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce nombre de Bebida: ");
        String nameBebida = sc.nextLine().trim();

        System.out.println("Bebida elegida: " + nameBebida);
        //nameBebida = nameBebida.replaceAll("\\s","");
        url = url.concat(nameBebida);

        System.out.println("URL :" + url);
        URL endpoint = new URL(url);

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Root root = objectMapper.readValue(endpoint, Root.class);
            for (Drink item : root.drinks) {
                if(nameBebida.equals(item.getStrDrink())){
                    System.out.println("Ingredientes: ");
                    for(int i = 1; i <= 15; i++){
                        String methodName = "getStrIngredient" + i;
                        Method method = item.getClass().getMethod(methodName);
                        if ( null != method.invoke(item) ){
                            System.out.print(method.invoke(item) + ", ");
                        }
                    }
                }
            }
        } catch (StreamReadException streamReadException) {
            streamReadException.printStackTrace();
        } catch (DatabindException databindException) {
            databindException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}

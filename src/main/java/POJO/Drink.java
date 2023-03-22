package POJO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@NoArgsConstructor
@ToString
public class Drink{
    public String idDrink;
    public String strDrink;
    public Object strDrinkAlternate;
    public Object strTags;
    public Object strVideo;
    public String strCategory;
    public Object strIBA;
    public String strAlcoholic;
    public String strGlass;
    public String strInstructions;
    public Object strInstructionsES;
    public String strInstructionsDE;
    public Object strInstructionsFR;
    public String strInstructionsIT;
    @JsonProperty("strInstructionsZH-HANS")
    public Object strInstructionsZHHANS;
    @JsonProperty("strInstructionsZH-HANT")
    public Object strInstructionsZHHANT;
    public String strDrinkThumb;
    public String strIngredient1;
    public String strIngredient2;
    public String strIngredient3;
    public String strIngredient4;
    public String strIngredient5;
    public String strIngredient6;
    public String strIngredient7;
    public String strIngredient8;
    public String strIngredient9;
    public String strIngredient10;
    public String strIngredient11;
    public String strIngredient12;
    public String strIngredient13;
    public String strIngredient14;
    public String strIngredient15;
    public String strMeasure1;
    public String strMeasure2;
    public String strMeasure3;
    public String strMeasure4;
    public String strMeasure5;
    public String strMeasure6;
    public String strMeasure7;
    public Object strMeasure8;
    public Object strMeasure9;
    public Object strMeasure10;
    public Object strMeasure11;
    public Object strMeasure12;
    public Object strMeasure13;
    public Object strMeasure14;
    public Object strMeasure15;
    public String strImageSource;
    public Object strImageAttribution;
    public String strCreativeCommonsConfirmed;
    public Object dateModified;
}
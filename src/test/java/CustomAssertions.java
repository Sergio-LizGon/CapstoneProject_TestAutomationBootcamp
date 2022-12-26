import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;

public class CustomAssertions extends Assert {
    public static void isElementPositionedCorrectly(String expectedPosition, String actualPosition){
        String errorMessage = "The element is not located properly it should be positioned at " +
                actualPosition + " not at " + expectedPosition;
        Assert.assertEquals(expectedPosition, actualPosition, errorMessage);
    }

    public static void isPriceDisplayed(String actualPrice){
        String errorMessage = "Price is not displayed correctly";
        Assert.assertTrue(actualPrice.contains("$"),errorMessage);
    }

    public static void isDescriptionDisplayed(String actualDescription){
        String errorMessage = "Product description is not displayed";
        Assert.assertTrue(actualDescription.contains("Product description"),errorMessage);
    }

    public static void isDeviceNameDisplayed(String actualName){
        String errorMessage = "Product name is not displayed or is displayed incorrectly";
        if (actualName.contains("Samsung") || actualName.contains("Nokia") || actualName.contains("Nexus")
        || actualName.contains("Iphone") || actualName.contains("Sony") || actualName.contains("HTC") ||
        actualName.contains("MacBook") || actualName.contains("Dell") || actualName.contains("Apple") || actualName.contains("ASUS"))
            Assert.assertTrue(true);
        else
            Assert.fail(errorMessage);
    }

    public static void isImageDisplayed(boolean image){
        String errorMessage = "Product image is not displayed";
        Assert.assertTrue(image, errorMessage);
    }

    public static void isAddToCartButtonDisplayed(String actualButtonText){
        String errorMessage = "Add to Cart Button is not present";
        Assert.assertTrue(actualButtonText.matches("Add to cart"),errorMessage);
    }

    public static void isAlertTextCorrect(String actualAlertText){
        String errorMessage = "Add to Cart Alert text is incorrect";
        Assert.assertTrue(actualAlertText.matches("Product added"),errorMessage);
    }

    public static void isPlaceOrderButtonDisplayed(String actualOrderButton){
        String errorMessage = "Place Order Button is incorrectly displayed";
        Assert.assertEquals(actualOrderButton, "Place Order", errorMessage);
    }

    public static void isDeleteButtonDisplayed(String actualDeleteButton){
        String errorMessage = "Delete Button is incorrectly displayed or not present";
        Assert.assertEquals(actualDeleteButton, "Delete", errorMessage);
    }

    public static void isCartPriceDisplayed(String priceDisplayed){
        boolean isNumeric = priceDisplayed.matches("[0-9.]+");
        String errorMessage = "Unit Price or Total Price is not present";
        Assert.assertTrue(isNumeric, errorMessage);
    }


}

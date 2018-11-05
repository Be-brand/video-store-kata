public class NewRelease
{
  private final String title;

  public NewRelease(String title)
  {
    this.title = title;
  }

  public String title()
  {
    return title;
  }

  public double price(int days)
  {
    return 3.0 * days;
  }
}

public class Image {

    // Fields:
    String url;
    String description;
    String title;
    String tags;

    // Constructor:
    public Image(String url, String description, String title, String tags) {
        this.url = url;
        this.description = description;
        this.title = title;
        this.tags = tags;
    }

    // Methods:

    // Setters
    public void setUrl(String url) {
        this.url = url;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    // Getters
    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public String getTags() {
        return tags;
    }

    @Override
    public String toString() {
        return "Image{" +
                "url='" + url + '\'' +
                ", description='" + description + '\'' +
                ", title='" + title + '\'' +
                ", tags='" + tags + '\'' +
                '}';
    }
}

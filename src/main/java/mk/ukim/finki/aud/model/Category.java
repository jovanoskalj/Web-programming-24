package mk.ukim.finki.aud.model;

import lombok.Data;

@Data
public class Category {
        private String name;
        private Long id;
        private String description;


        public Category(String name, String description) {
            this.name = name;
            this.description = description;
            this.id = (long) (Math.random() * 1000);
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }



}

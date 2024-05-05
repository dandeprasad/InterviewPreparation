package dandepreparation;

import java.util.*;

import dandepreparation.UniqueImages.Image;

class UniqueImages {
	public static class Image {
		private String filename;
		private int width;
		private int height;

		public Image(String filename, int width, int height) {
			this.filename = filename;
			this.width = width;
			this.height = height;

		}

		/**
		 * Two Images are considered equal if they have the same filename (without the
		 * extension), and the same number of pixels. Thus, flag.jpg with width=60
		 * height=40 is equal to flag.gif with width=40 and height=60
		 */
		public boolean equals(Object other) {
			Image o = (Image) other;
			if (filename == null || o.filename == null)
				return false;
			String[] components = filename.split("\\.");
			String[] ocomponents = o.filename.split("\\.");
			
			// dande fix for checking capital letters as well for the image name
			return components[0].equalsIgnoreCase(ocomponents[0]) && width * height == o.width * o.height;
		}

		public String toString() {
			return "Image: filename=" + filename + " Size=" + width * height;
		}
	}

	public static void printImages(Set<Image> images) {

		List<Image> list = new ArrayList<Image>();

		for (Image image : images) {

			System.out.println(image.filename);
		}
		System.out.println("Total size: "+ images.size());
	}

	public static void main(String[] args) {
		Image[] images = { new Image("flag.jpg", 40, 60), new Image("flag.gif", 40, 60),
				new Image("smile.gif", 100, 200), new Image("smile.gif", 50, 400), new Image("other.jpg", 40, 60),
				new Image("lenna.jpg", 512, 512), new Image("Lenna.jpg", 512, 512) };

		
		
		//dande fix for iterating through the array of images and sending only unique images for printing
		ArrayList<Image> uniqueImages = new ArrayList<Image>();

		outerloop: for (int i = 0; i < images.length; i++) {

			for (int j = 0; j < images.length; j++) {
				if (i != j) {
					Boolean check = images[i].equals(images[j]);
					if (check) {
						images[i] = new Image("", 0, 0);
						continue outerloop;

					}

				}
			}
			uniqueImages.add(images[i]);
		}
		Set<Image> set = new HashSet<Image>(uniqueImages);
		UniqueImages.printImages(set);
	}
}

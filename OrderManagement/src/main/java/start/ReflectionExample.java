package start;

import java.lang.reflect.Field;

/**
 * This class does the Reflection operations
 */

public class ReflectionExample {

	public static String[] addElement(String[] array, String element) {
		String[] newArray = new String[array.length + 1];  // Create a new array with increased size
		System.arraycopy(array, 0, newArray, 0, array.length);  // Copy existing elements
		newArray[array.length] = element;  // Add the new element
		return newArray;
	}

	public static Object[] addElement2(Object[] array, String element) {
		Object[] newArray = new Object[array.length + 1];  // Create a new array with increased size
		System.arraycopy(array, 0, newArray, 0, array.length);  // Copy existing elements
		newArray[array.length] = element;  // Add the new element
		return newArray;
	}


	public static int getNrFields(Object object) {

		int i=0;

		for (Field field : object.getClass().getDeclaredFields()) {
			i++;
		}
		return i;
	}

	/**
	 * This method extract field name from an object and returns the header for the JTable
	 * @param object
	 * @return
	 */
	public static String[] retrieveProperties(Object object) {

		String[] columnNames = new String[0];

		for (Field field : object.getClass().getDeclaredFields()) {
			field.setAccessible(true);
			try {
				columnNames = addElement(columnNames, field.getName());


			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}

		}
		return columnNames;
	}


	/**
	 * This method extract the field values from an object and returns it
	 * @param object
	 * @return
	 */

	public  Object[]  getRows(Object object) {

		Object[] rowData = new String[0];

		for (Field field : object.getClass().getDeclaredFields())
		{
			Object value;
			field.setAccessible(true);
			try
			{
				value = field.get(object);
				rowData = addElement2(rowData, value.toString());


			} catch (IllegalArgumentException e)
			{
				e.printStackTrace();
			} catch (IllegalAccessException e)
			{
				throw new RuntimeException(e);
			}
		}
		return rowData;
}

}




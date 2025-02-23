package annotations.advancedlevel.roleallowedannotation;

import java.lang.reflect.Method;

class RoleValidator {
    private static String currentUserRole = "USER"; // Change this to "ADMIN" to allow access

    public static void invokeIfAuthorized(Object obj, String methodName) {
        try {
            Method method = obj.getClass().getMethod(methodName);

            if (method.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
                if (!roleAllowed.value().equals(currentUserRole)) {
                    System.out.println("Access Denied! Only " + roleAllowed.value() + " can access this method.");
                    return;
                }
            }

            // Invoke the method if access is allowed
            method.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setCurrentUserRole(String role) {
        currentUserRole = role; // Change role dynamically
    }
}


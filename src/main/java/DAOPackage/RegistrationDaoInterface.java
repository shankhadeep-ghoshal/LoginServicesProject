package DAOPackage;

import com.sun.istack.internal.Nullable;

import javax.naming.NamingException;
import javax.validation.constraints.NotNull;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.LinkedHashMap;

public interface RegistrationDaoInterface {
    boolean insertIntoDb();

    boolean updateCredentials(@NotNull String UserId, @Nullable String Username,
                              @Nullable String realFirstname, @Nullable String realMiddleName, @Nullable String realLastname,
                              @Nullable String Password, @Nullable String SecretQuestion, @Nullable String Answer)
            throws InvalidKeySpecException, NoSuchAlgorithmException;

    void fireUidChangeToAllServices(@NotNull String UUID, @NotNull String password);

    LinkedHashMap<String, Object> authenticateUser(@NotNull String username, @NotNull String password) throws InvalidKeySpecException,
            NoSuchAlgorithmException;

    boolean logoutService(@NotNull String username, @NotNull String clientToken);

    RegistrationDaoInterface setRealfirstname(@NotNull String realFirstname);

    RegistrationDaoInterface setRealmiddlename(@NotNull String realMiddlename);

    RegistrationDaoInterface setReallastname(@NotNull String realLastname);

    RegistrationDaoInterface setUsername(@NotNull String username);

    RegistrationDaoInterface setUniqueid(@NotNull String uniqueId);

    RegistrationDaoInterface setSecretQuestion(@NotNull String secretQuestion);

    RegistrationDaoInterface setAnswer(@NotNull String answer);

    RegistrationDaoInterface setPassword(@NotNull String password);

    @NotNull
    RegistrationDaoInterface createRegistrationDAO() throws NamingException;


}

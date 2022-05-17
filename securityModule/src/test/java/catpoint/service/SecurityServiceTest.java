package catpoint.service;

import catpoint.data.AlarmStatus;
import catpoint.data.ArmingStatus;
import catpoint.data.Sensor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SecurityServiceTest {

    @Mock
    private SecurityServiceInterface securityServiceInterface;
    private SecurityService securityService;
    private Sensor sensor;
    private Boolean active = true;

    @BeforeEach
    void init()
    {
       securityService = new SecurityService(securityServiceInterface);
    }

    @Test
    void pendingStatus_alarmIsArmed_SensorIsActivated_SystemReturnsPendingStatus()
    {

    }

}

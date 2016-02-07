package org.eclipse.paho.client.mqttv3.internal;

import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;

/**
 * IMqttNetworkFactory is not part auf the standard mqttv3  client
 *
 * @author Thomas Kriechbaum
 */
public interface IMqttNetworkFactory {

    /**
     * Factory method to create the correct network module, based on the
     * supplied address URI.
     *
     * @param address the URI for the server.
     * @param options options
     * @return a network module appropriate to the specified address.
     */
    NetworkModule createNetworkModule(String address, MqttConnectOptions options, String clientid) throws MqttException;

}

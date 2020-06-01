package toy.rpc.framework.registry.load.balance;

import toy.rpc.framework.common.model.URL;

import java.util.List;
import java.util.Random;

public class RandomLoadBalanceStrategy implements LoadBalanceStrategy {
    Random random = new Random();

    @Override
    public URL choose(List<URL> urls) {
        int i = random.nextInt(urls.size());
        return urls.get(i);
    }
}

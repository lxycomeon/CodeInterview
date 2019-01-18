package Basic1;

import java.util.LinkedHashMap;
import java.util.Map;
 
public class LRUCache1<K, V> extends LinkedHashMap<K, V> {
  private int cacheSize;
 
  LRUCache1(int cacheSize) {
    super(16, 0.75f, true);
    this.cacheSize = cacheSize;
  }
 
  protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
    return size() >= cacheSize;
  }
}

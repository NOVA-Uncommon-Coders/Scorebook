package com.theironyard.novauc;

import com.theironyard.novauc.entities.Batter;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mfahrner on 4/21/17.
 */
public interface BatterRepo extends CrudRepository<Batter, Integer> {
}

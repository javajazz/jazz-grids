package de.scravy.jazz.grids;

import de.scravy.jazz.Event;
import de.scravy.jazz.annotation.Experimental;

/**
 * A {@link TileEventHandler} that simply does nothing.
 *
 * @author Julian Fleischer
 *
 * @param <T>
 */
@Experimental
public class DefaultTileEventHandler<T> implements TileEventHandler<T> {

  @Override
  public T on(final Event ev, final T tile) {
    return tile;
  }
}

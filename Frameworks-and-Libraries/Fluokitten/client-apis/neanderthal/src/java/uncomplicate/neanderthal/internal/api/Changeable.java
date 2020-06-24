//   Copyright (c) Dragan Djuric. All rights reserved.
//   The use and distribution terms for this software are covered by the
//   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php) or later
//   which can be found in the file LICENSE at the root of this distribution.
//   By using this software in any fashion, you are agreeing to be bound by
//   the terms of this license.
//   You must not remove this notice, or any other, from this software.

package uncomplicate.neanderthal.internal.api;

import clojure.lang.IFn;

public interface Changeable {

    boolean isAllowed (long i, long j);

    boolean isAllowed (long i);

    Changeable setBoxed (Number val);

    Changeable setBoxed (long i, long j, Number val);

    Changeable setBoxed (long i, Number val);

    Changeable alter (IFn fn);

    Changeable alter (long i, IFn fn);

    Changeable alter (long i, long j, IFn fn);
}

package com.inpows.weapow.base

import androidx.fragment.app.Fragment


/**
 * @author Fauhan Handay Pugar (fauhan.pugar@dana.id)
 * @version NavigationHost, v 0.1 24/04/22 12.24 by Fauhan Handay Pugar
 */

/**
 * A host (typically an `Activity`} that can display fragments and knows how to respond to
 * navigation events.
 */
interface NavigationHost {
    /**
     * Trigger a navigation to the specified fragment, optionally adding a transaction to the back
     * stack to make this navigation reversible.
     */
    fun navigateTo(fragment: Fragment, addToBackstack: Boolean)
}
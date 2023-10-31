package com.mycontacts.presentation.main.states

import com.mycontacts.data.contacts.ContactInfo
import com.mycontacts.utils.ContactOrder
import com.mycontacts.utils.ContactOrderType

data class ContactsState(
    val isLoading: Boolean = false,
    val errorMessage: String = "",
    val contacts: Map<Char, List<ContactInfo>> = emptyMap(),
    val contactOrder: ContactOrder = ContactOrder.TimeStamp(ContactOrderType.Descending)
)
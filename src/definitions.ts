interface ListenerCallbackData {
    text: string;
}

type ListenerCallback = (data: ListenerCallbackData) => void;

export interface ContextMenuPlugin {
    checkProcessTextIntentReceived(): Promise<{ text: string }>;   
    addListener(eventName: 'processTextReceived', listenerFunc: ListenerCallback): void;
}

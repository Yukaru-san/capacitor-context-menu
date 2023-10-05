export interface ContextMenuPlugin {
    checkProcessTextIntentReceived(): Promise<{ text: string }>;   
    addListener(eventName: 'processTextReceived', listenerFunc: (text: string) => void): void;
}
